package interfaces;

import players.Player;
import tools.HealingTool;

public interface IHealer {

    void heal(HealingTool healingTool, Player player);

}
