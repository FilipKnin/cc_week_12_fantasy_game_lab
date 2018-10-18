package players;

import interfaces.IWarrior;
import tools.Weapon;

public class Barbarian extends Player implements IWarrior {
    public Barbarian(int hp, int strength) {
        super(hp, strength);
    }

    public int attack(Weapon weapon) {
        return weapon.getDamage();
    }
}
