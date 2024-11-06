package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.AbstactAbility.Fireball;

public class Mage extends Hero{
    public Mage(String nome){
        super(nome,100,50,15);
    }

    @Override
    public void usarHabilidade() {
        Fireball fireball =  new Fireball();
        fireball.ativar(this);

        System.out.println(nome + " usa Fireball");
    }

}
