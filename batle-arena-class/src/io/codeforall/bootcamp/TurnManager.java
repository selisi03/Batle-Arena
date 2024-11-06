package io.codeforall.bootcamp;

import io.codeforall.bootcamp.Hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TurnManager {
    public static List<Hero> herois;
    private int rodada;
    private Random random;

    public TurnManager(List<Hero> herois) {
        TurnManager.herois = herois;
        this.rodada = 0;
        this.random = new Random();
    }

    public void iniciarJogo() {
        System.out.println(" ");
        System.out.println("=== A BATALHA COMEÇA! ===");
        while (herois.stream().anyMatch(Hero::estaVivo)) {
            rodada++;
            System.out.println("\n--- RONDA " + rodada + " ---");
            for (Hero heroi : herois) {
                if (heroi.estaVivo()) {
                    System.out.println("\nRonda do " + heroi.nome);
                    heroi.receberMana(10);
                    Hero alvo = selecionarAlvoAleatorio(heroi);
                    if (alvo != null) {
                        heroi.atacar(alvo);
                    }
                    if (heroi.podeUsarHabilidade()) {
                        heroi.usarHabilidade();
                    } else {
                        System.out.println(heroi.nome + " não pode usar a habilidade devido ao cooldown.");
                    }
                    heroi.reduzirCooldown();
                }
            }
            verificarFimDeJogo();
        }
    }

    public static Hero selecionarAlvoAleatorio(Hero atacante) {
        List<Hero> alvosPossiveis = new ArrayList<>();
        for (Hero heroi : herois) {
            if (heroi != atacante && heroi.estaVivo()) {
                alvosPossiveis.add(heroi);
            }
        }
        if (alvosPossiveis.isEmpty()) {
            return null;
        }
        return alvosPossiveis.get(new Random().nextInt(alvosPossiveis.size()));
    }

    private void verificarFimDeJogo() {
        long heroisVivos = herois.stream().filter(Hero::estaVivo).count();
        if (heroisVivos <= 1) {
            System.out.println(" ");
            System.out.println("Fim do jogo!");
            System.out.println(" ");
            herois.stream().filter(Hero::estaVivo).forEach(heroi -> System.out.println(heroi.nome + " é o VENCEDOR!"));
            System.exit(0);

        } else {
            System.out.println("\n--- Fim da ronda " + rodada + " ---");
            System.out.println(" ");
            System.out.println("Status Heróis:");
            herois.forEach(heroi -> System.out.println(heroi.nome + " - Vida: " + heroi.vida + ", Mana: " + heroi.mana));
        }
    }
}
