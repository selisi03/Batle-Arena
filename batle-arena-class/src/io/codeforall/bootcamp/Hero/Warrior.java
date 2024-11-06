package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.AbstactAbility.ShieldBlock;

public class Warrior extends Hero {

    public Warrior(String nome) {
        super(nome, 150, 30, 20);
    }

    @Override
    public void usarHabilidade() {

        ShieldBlock shieldBlock = new ShieldBlock();
        shieldBlock.ativar(this);

        System.out.println(nome + " usa ShieldBlock");

    }
}
