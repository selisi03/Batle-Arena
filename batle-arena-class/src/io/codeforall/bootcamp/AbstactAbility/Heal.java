package io.codeforall.bootcamp.AbstactAbility;

import io.codeforall.bootcamp.Hero.Hero;

public class Heal extends AbstractAbility {

   // private static final int cooldown = 2;

    public Heal() {
        super("Heal", 10,2);
    }

    @Override
    public void ativar(Hero heroi) {
        if (heroi.mana >= custoMana) {

            heroi.receberMana(-custoMana);
            heroi.receberDano(-20); // Cura o herói

            System.out.println( heroi.nome + " usa Heal e recupera 20 pontos de vida");
            heroi.iniciarCooldown(cooldown);

        } else if (heroi.mana < custoMana){
            System.out.println(heroi.nome + " não tem mana suficiente para usar o Heal");
        } else {
            System.out.println(heroi.nome + " ainda está em cooldown e não pode usar Heal!");

        }

    }
}














    /*
    public Heal() {
        super("Heal", 20, 8);
    }
    @Override
    public void use(Hero target) {
        target.heal(this.power);
        System.out.println(target.name + " foi curado em " + this.power + " pontos de vida!");
    }
}*/