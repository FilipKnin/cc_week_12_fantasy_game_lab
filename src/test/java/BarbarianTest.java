import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import rooms.Room;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon1;
    Room room;

    @Before
    public void before() {
        barbarian = new Barbarian(100,8);
        weapon1 = new Weapon("Axe", 10);
        room = new Room();
    }

    @Test
    public void hashp() {
        assertEquals(100, barbarian.getHp() );
    }

    @Test
    public void hasStrength() {
        assertEquals(8, barbarian.getStrength() );
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, barbarian.getTreasure() );
    }

    @Test
    public void canIncreaseHp() {
        barbarian.increaseHp(10);
        assertEquals(110, barbarian.getHp() );
    }

    @Test
    public void canDecreaseHp() {
        barbarian.decreaseHp(10);
        assertEquals(90, barbarian.getHp() );
    }

    @Test
    public void canAttack() {
        assertEquals(10, barbarian.attack(weapon1));
    }

    @Test
    public void canCollectTreasureBarbrianGetsTreasure() {
        room.setTreasure(1000);
        barbarian.collectTreasure(room);
        assertEquals(1000, barbarian.getTreasure());
    }

    @Test
    public void canCollectTreasureRoomTreasureRemoved() {
        room.setTreasure(1000);
        barbarian.collectTreasure(room);
        assertEquals(0, room.getTreasure());
    }

}
