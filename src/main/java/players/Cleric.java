package players;

import interfaces.IHealer;
import rooms.Room;
import tools.HealingTool;

import java.util.ArrayList;

public class Cleric extends Player implements IHealer {
    public Cleric(int hp, int strength) {
        super(hp, strength);
    }


    public void heal(HealingTool healingTool, Player player) {
        player.increaseHp(healingTool.getDamageRestored());
    };

    public void takeTurn(Room room) {
        ArrayList<Player> party = room.getParty();
        int min = 0;
        Player minHPPlayer = party.get(0);
        for (Player player : party) {
            if (player.getHp() < min) {
                min = player.getHp();
                minHPPlayer = player;
            }
        }
        heal((HealingTool)this.getTools().get(0), minHPPlayer);

    }

}
