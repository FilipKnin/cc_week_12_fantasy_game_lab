import org.junit.Before;
import org.junit.Test;
import players.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock(100,8);
    }

    @Test
    public void hashp() {
        assertEquals(100, warlock.getHp() );
    }

    @Test
    public void hasStrength() {
        assertEquals(8, warlock.getStrength() );
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, warlock.getTreasure() );
    }

    @Test
    public void canIncreaseHp() {
        warlock.increaseHp(10);
        assertEquals(110, warlock.getHp() );
    }

    @Test
    public void canDecreaseHp() {
        warlock.decreaseHp(10);
        assertEquals(90, warlock.getHp() );
    }
}
