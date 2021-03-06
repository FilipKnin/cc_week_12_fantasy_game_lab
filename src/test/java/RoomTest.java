import org.junit.Before;
import org.junit.Test;
import players.*;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Player boss;
    Player cleric;
    Player barbarian;
    Player wizard;
    ArrayList<Player> party;

    @Before
    public void before() {
        room = new Room();
        boss = new Boss(20, 20);
        cleric = new Cleric(20, 20);
        barbarian = new Barbarian(20, 20);
        wizard = new Wizard(20, 20);
        party = new ArrayList<>();
        party.add(cleric);
        party.add(barbarian);
        party.add(wizard);
    }

    @Test
    public void hasNoInitialTreasure() {
        assertEquals(0, room.getTreasure());
    }

    @Test
    public void canSetTreasure() {
        room.setTreasure(1000);
        assertEquals(1000, room.getTreasure());
    }

    @Test
    public void hasNoInitialBoss() {
        assertEquals(null, room.getBoss());
    }

    @Test
    public void canSetBoss() {
        room.setBoss(boss);
        assertEquals(boss, room.getBoss());
    }

    @Test
    public void hasNoInitialParty() {
        assertEquals(0, room.getPartyCount());
    }

    @Test
    public void canSetParty() {
        room.setParty(party);
        assertEquals(3, room.getPartyCount());
    }

    @Test
    public void hasNoInitialTurns() {
        assertEquals(0, room.getTurnsCount());
    }

    @Test
    public void canSetTurns() {
        room.setBoss(boss);
        room.setParty(party);
        room.setTurns();
        assertEquals(4, room.getTurnsCount());
    }

}
