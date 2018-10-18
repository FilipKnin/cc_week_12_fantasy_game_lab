import org.junit.Before;
import org.junit.Test;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Weapon", 10);
    }

    @Test
    public void getToolType(){
        assertEquals("Weapon", weapon.getToolType());
    }

    @Test
    public void getDamage(){
        assertEquals("Weapon", weapon.getDamage());
    }

}
