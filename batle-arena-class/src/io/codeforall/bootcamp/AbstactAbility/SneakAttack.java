package io.codeforall.bootcamp.AbstactAbility;

import io.codeforall.bootcamp.Hero.Hero;
import io.codeforall.bootcamp.TurnManager;

public class SneakAttack extends AbstractAbility {

    //private static final int cooldown = 1;

    public SneakAttack() {
        super("SneakAttack", 0,1);
    }

    @Override
    public void ativar(Hero heroi) {
        Hero alvo = TurnManager.selecionarAlvoAleatorio(heroi);
        if (alvo != null) {
            int danoCritico = heroi.dano * 2;
            System.out.println(heroi.nome + " usa SneakAttack e causa " + danoCritico + " de dano crítico ao " + alvo.nome + "!");
            alvo.receberDano(danoCritico);
        }
    }
}