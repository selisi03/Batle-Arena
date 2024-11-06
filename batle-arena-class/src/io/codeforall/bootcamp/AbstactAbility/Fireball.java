package io.codeforall.bootcamp.AbstactAbility;


import io.codeforall.bootcamp.Hero.Hero;
import io.codeforall.bootcamp.TurnManager;

public class Fireball extends AbstractAbility {

    //private static final  int cooldown = 3;

    public Fireball() {
        super("Fireball", 10, 3);
    }

    @Override
    public void ativar(Hero heroi) {
        if (heroi.mana >= custoMana) {
            heroi.receberMana(-custoMana);

            Hero alvo = TurnManager.selecionarAlvoAleatorio(heroi);
            if (alvo != null) {
                int danoFireball = heroi.dano * 2;

                System.out.println(heroi.nome + "usa a Fireball e dá :" + danoFireball + " de dano ao " + alvo.nome);
                alvo.receberDano(danoFireball);
                heroi.iniciarCooldown(cooldown);
            }

        } else if (heroi.mana < custoMana) {
            System.out.println(heroi.nome + " não tem mana suficiente para usar a Fireball");
        } else {
            System.out.println(heroi.nome + " ainda está em cooldown e não pode usar Fireball");
        }
    }
}