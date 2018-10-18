import org.junit.Before;
import org.junit.Test;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    private Spell spell;

    @Before
    public void before(){
        spell = new Spell("BallOfFire", 10);
    }

    @Test
    public void getToolType(){
        assertEquals("BallOfFire", spell.getName());
    }

    @Test
    public void getDamage(){
        assertEquals(10, spell.getDamage());
    }

}
