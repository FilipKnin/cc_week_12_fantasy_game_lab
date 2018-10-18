package players;

import interfaces.IHealer;
import interfaces.IMagical;
import interfaces.IWarrior;
import tools.HealingTool;
import tools.Spell;
import tools.Weapon;

import java.util.ArrayList;

public class Boss extends Player implements IHealer, IMagical, IWarrior {

    public Boss(int hp, int strength) {
        super(hp, strength);
    }

    private int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    @Override
    public int heal(HealingTool healingTool) {
        int healingMin = healingTool.getDamageRestored();
        int healingMax = healingMin + getStrength();
        return randomWithRange(healingMin, healingMax);
    }

    @Override
    public int castSpell(Spell spell) {
        int damageMin = spell.getDamage();
        int damageMax = damageMin + getStrength();
        return randomWithRange(damageMin, damageMax);
    }

    @Override
    public int attack(Weapon weapon) {
        int damageMin = weapon.getDamage();
        int damageMax = damageMin + getStrength();
        return randomWithRange(damageMin, damageMax);
    }
}
