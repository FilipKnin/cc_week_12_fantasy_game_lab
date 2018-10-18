import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before() {
        room = new Room();
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
        room.setBoss("boss");
        assertEquals("boss", room.getBoss());
    }

}
