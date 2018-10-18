import org.junit.Before;
import org.junit.Test;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    private HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool("Potion", 10);
    }

    @Test
    public void getName(){
        assertEquals("Potion", healingTool.getName());
    }

    @Test
    public void getDamageRestored(){
        assertEquals(10, healingTool.getDamageRestored());
    }

}
