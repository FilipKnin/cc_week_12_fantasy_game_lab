import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool;

    @Before
    public void before() {
        cleric = new Cleric(100,8);
        healingTool = new HealingTool("Potion", 10);
    }

    @Test
    public void hashp() {
        assertEquals(100, cleric.getHp() );
    }

    @Test
    public void hasStrength() {
        assertEquals(8, cleric.getStrength() );
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, cleric.getTreasure() );
    }

    @Test
    public void canIncreaseHp() {
        cleric.increaseHp(10);
        assertEquals(110, cleric.getHp() );
    }

    @Test
    public void canDecreaseHp() {
        cleric.decreaseHp(10);
        assertEquals(90, cleric.getHp() );
    }

    @Test
    public void canHeal() {
        assertEquals(10, cleric.heal(healingTool));
    }
}
