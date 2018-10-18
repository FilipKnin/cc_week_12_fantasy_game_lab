package tools;

public class Spell extends Tools {

    private int damage;

    public Spell(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}
