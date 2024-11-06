package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.AbstactAbility.Heal;

public class Cleric extends Hero {
        public Cleric(String nome) {
            super(nome, 120, 40, 10);
        }

        @Override
        public void usarHabilidade() {
            Heal heal = new Heal();
            heal.ativar(this);

            System.out.println(nome + " usa Heal!");

        }
    }

