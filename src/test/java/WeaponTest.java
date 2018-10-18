import org.junit.Before;
import org.junit.Test;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Axe", 10);
    }

    @Test
    public void getName(){
        assertEquals("Axe", weapon.getName());
    }

    @Test
    public void getDamage(){
        assertEquals(10, weapon.getDamage());
    }

}
