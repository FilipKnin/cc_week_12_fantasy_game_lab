package players;

import interfaces.IHealer;
import tools.HealingTool;

public class Cleric extends Player implements IHealer {
    public Cleric(int hp, int strength) {
        super(hp, strength);
    }


    public int heal(HealingTool healingTool) {
        return healingTool.getDamageRestored();
    };
}
