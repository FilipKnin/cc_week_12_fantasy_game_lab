package players;

import interfaces.IMagical;
import tools.Spell;

public class Wizard extends Player implements IMagical {
    public Wizard(int hp, int strength) {
        super(hp, strength);
    }

    public int castSpell(Spell spell) {
        return spell.getDamage();
    }
}
