import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian(100,8);
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

}
