import org.junit.Before;
import org.junit.Test;
import players.Player;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Player boss;

    @Before
    public void before() {
        room = new Room();
        boss = new Player();
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

}
