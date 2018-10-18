package players;

import interfaces.IMagical;
import tools.Spell;

public class Warlock extends Player implements IMagical {
    public Warlock(int hp, int strength) {
        super(hp, strength);
    }

    public int castSpell(Spell spell) {
        return spell.getDamage();
    }
}
