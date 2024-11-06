package io.codeforall.bootcamp.AbstactAbility;

import io.codeforall.bootcamp.Ability;
import io.codeforall.bootcamp.Hero.Hero;

public abstract class AbstractAbility implements Ability {
    public String nome;
    public int custoMana;
    public int cooldown;

    public AbstractAbility(String nome, int custoMana, int cooldown) {
        this.nome = nome;
        this.custoMana = custoMana;
        this.cooldown = cooldown;
    }

    @Override
    public void ativar(Hero heroi) {

    }

}
