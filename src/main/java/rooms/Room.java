package rooms;

public class Room {

    private int treasure;
    private String boss;

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

    public String getBoss() {
        return this.boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }
}
