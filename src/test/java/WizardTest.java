import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;

    @Before
    public void before() {
        wizard = new Wizard(100,8);
        spell = new Spell("BallOfFire", 10);
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

    @Test
    public void canCastSpell() {
        assertEquals(10, wizard.castSpell(spell));
    }


}
