package io.codeforall.bootcamp.Hero;

public abstract class Hero {
    public String nome;
    public int vida;
    public int mana;
    public int manaMaxima;
    public int dano;
    public boolean defesa;
    public int cooldown;

    public Hero(String nome, int vida, int manaMaxima, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.mana = 0;
        this.manaMaxima = manaMaxima;
        this.dano = dano;
        this.defesa = false;
        this.cooldown = 0;
    }

    public abstract void usarHabilidade();

    public void reduzirCooldown() {
        if (cooldown > 0) {
            cooldown--;
        }
    }

    public boolean podeUsarHabilidade() {
        return cooldown == 0;
    }

    public void iniciarCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public void receberDano(int dano) {
        if (defesa) {
            System.out.println(nome + " está com a defesa ativada! O dano foi reduzido pela metade.");
            dano /= 2;
            defesa = false;
        }
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println(nome + " foi eliminado");
        } else {
            System.out.println(nome + " agora tem " + vida + " pontos de vida.");
        }
    }

    public void receberMana(int mana) {
        this.mana = Math.min(this.mana + mana, this.manaMaxima);
        System.out.println(nome + " recupera " + mana + " de mana. Mana atual: " + this.mana + "/" + this.manaMaxima);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void atacar(Hero alvo) {
        if (alvo.estaVivo()) {
            System.out.println(nome + " ataca " + alvo.nome + " dando " + dano + " de dano!");
            alvo.receberDano(dano);
        }
    }
}
