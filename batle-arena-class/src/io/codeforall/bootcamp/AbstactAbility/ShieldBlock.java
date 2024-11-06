package io.codeforall.bootcamp.AbstactAbility;

import io.codeforall.bootcamp.Hero.Hero;

public class ShieldBlock extends AbstractAbility {

   // private static final int cooldown = 1;

    public ShieldBlock() {
        super("ShieldBock", 0,1);
    }

    @Override
    public void ativar(Hero heroi) {
        if (heroi.podeUsarHabilidade()) {
            heroi.defesa = true;
            System.out.println(heroi.nome + " usa SheilBlock e aumenta a defesa");
            heroi.iniciarCooldown(cooldown);
        } else {
            System.out.println(heroi.nome + " ainda está em cooldown e não pode usar SheildBlock ");
        }
    }
}