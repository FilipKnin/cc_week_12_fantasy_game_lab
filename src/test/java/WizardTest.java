import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard(100,8);
    }

    @Test
    public void hashp() {
        assertEquals(100, wizard.getHp() );
    }

    @Test
    public void hasStrength() {
        assertEquals(8, wizard.getStrength() );
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, wizard.getTreasure() );
    }

    @Test
    public void canIncreaseHp() {
        wizard.increaseHp(10);
        assertEquals(110, wizard.getHp() );
    }

    @Test
    public void canDecreaseHp() {
        wizard.decreaseHp(10);
        assertEquals(90, wizard.getHp() );
    }
}
