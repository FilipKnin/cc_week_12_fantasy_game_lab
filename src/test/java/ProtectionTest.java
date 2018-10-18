import org.junit.Before;
import org.junit.Test;
import tools.Protection;

import static org.junit.Assert.assertEquals;

public class ProtectionTest {

    private Protection protection;

    @Before
    public void before(){
        protection = new Protection("Shield", 5);
    }

    @Test
    public void getName(){
        assertEquals("Shield", protection.getName());
    }

    @Test
    public void getDamageReduction(){
        assertEquals(5, protection.getDamageReduction());
    }

}
