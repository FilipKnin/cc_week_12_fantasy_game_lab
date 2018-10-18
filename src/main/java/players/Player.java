package players;

import rooms.Room;
import tools.Tools;

import java.util.ArrayList;

public abstract class Player {

    private int hp;
    private int strength;
    private int treasure;
    private ArrayList<Tools> tools;

    public Player(int hp, int strength) {
        this.hp = hp;
        this.strength = strength;
        this.tools = new ArrayList<>();
        this.treasure = 0;
    }

    public int getHp() {
        return this.hp;
    }

    public int getStrength() {
        return this.strength;
    }

    public ArrayList<Tools> getTools() {
        return this.tools;
    }

    public int countTools() {
        return this.tools.size();
    }

    public void increaseHp(int hpPoints) {
        this.hp = this.hp + hpPoints;
    }

    public void decreaseHp(int hpPoints) {
        this.hp = this.hp - hpPoints;
    }

    public void collectTreasure(Room room) {
        this.treasure += room.getTreasure();
        room.setTreasure(0);
    }

    public void takeTurn() {
    }

    public int getTreasure() {
        return this.treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public void addTool(Tools tool) {
        this.tools.add(tool);
    }
}
