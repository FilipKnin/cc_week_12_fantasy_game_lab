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


}
