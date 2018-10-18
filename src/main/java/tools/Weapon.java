package tools;

public class Weapon extends Tools {

    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}
