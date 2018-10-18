package players;

import java.util.ArrayList;

public abstract class Player {

    private int hp;
    private int strength;
    private ArrayList<Tools> tools;

    public Player(int hp, int strength) {
        this.hp = hp;
        this.strength = strength;
        this.tools = new ArrayList<>();
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



}
