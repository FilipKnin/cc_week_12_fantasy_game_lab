package rooms;

import players.Player;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class Room {

    private int treasure;
    private Player boss;
    private ArrayList<Player> party;
    private ArrayList<Player> turns;

    public Room() {
        this.treasure = 0;
        this.boss = null;
        this.party = new ArrayList<>();
        this.turns = new ArrayList<>();
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

    public int getPartyCount() {
        return this.party.size();
    }

    public ArrayList<Player> getParty() {
        return this.party;
    }

    public void setParty(ArrayList<Player> party) {
        this.party = party;
    }

    public int getTurnsCount() {
        return this.turns.size();
    }

    public ArrayList<Player> setTurns() {
        this.turns.addAll(this.party);
        this.turns.add(this.boss);
        shuffle(this.turns);
        return this.turns;
    }


}
