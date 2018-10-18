package rooms;

import players.Player;

public class Room {

    private int treasure;
    private Player boss;

    public Room() {
        this.treasure = 0;
        this.boss = null;
    }

    public int getTreasure() {
        return this.treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public Player getBoss() {
        return this.boss;
    }

    public void setBoss(Player boss) {
        this.boss = boss;
    }
}
