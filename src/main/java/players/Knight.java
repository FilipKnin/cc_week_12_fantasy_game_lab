package players;

import interfaces.IWarrior;
import tools.Weapon;

public class Knight extends Player implements IWarrior {
    public Knight(int hp, int strength) {
        super(hp, strength);
    }

    public int attack(Weapon weapon) {
        return weapon.getDamage();
    }
}
