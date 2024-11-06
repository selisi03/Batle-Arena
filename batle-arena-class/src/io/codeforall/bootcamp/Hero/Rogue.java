package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.AbstactAbility.SneakAttack;


public class Rogue extends Hero {
    public Rogue(String nome) {
        super(nome, 110, 20, 25);
    }

    @Override
    public void usarHabilidade() {

        SneakAttack sneakAttack = new SneakAttack();
        sneakAttack.ativar(this);

        System.out.println(nome + " usa SneaKAttack");
    }
}