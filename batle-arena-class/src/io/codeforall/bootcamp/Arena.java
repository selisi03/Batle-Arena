package io.codeforall.bootcamp;

import io.codeforall.bootcamp.Hero.*;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private List<Hero> herois;

    public Arena() {
        herois = new ArrayList<>();
        herois.add(new Mage("Mage"));
        herois.add(new Cleric("Cleric"));
        herois.add(new Warrior("Warrior"));
        herois.add(new Rogue("Rogue"));
    }

    public void iniciarBatalha() {
        System.out.println(" ");
        System.out.println("=== OS HERÓIS ENTRAM NA ARENA ===");
        herois.forEach(hero -> System.out.println(hero.nome + " entra na arena"));
        TurnManager turnManager = new TurnManager(herois);
        turnManager.iniciarJogo();
    }

}


