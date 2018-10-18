package players;

import interfaces.IWarrior;
import tools.Weapon;

public class Ranger extends Player implements IWarrior {
    public Ranger(int hp, int strength) {
        super(hp, strength);
    }

    public int attack(Weapon weapon) {
        return weapon.getDamage();
    }
}
