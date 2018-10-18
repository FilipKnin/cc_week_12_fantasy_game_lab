import org.junit.Before;
import org.junit.Test;
import players.Knight;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon1;


    @Before
    public void before() {
        knight = new Knight(100,8);
        weapon1 = new Weapon("Axe", 10);
    }

    @Test
    public void hashp() {
        assertEquals(100, knight.getHp() );
    }

    @Test
    public void hasStrength() {
        assertEquals(8, knight.getStrength() );
    }

    @Test
    public void hasTreasure() {
        assertEquals(0, knight.getTreasure() );
    }

    @Test
    public void canIncreaseHp() {
        knight.increaseHp(10);
        assertEquals(110, knight.getHp() );
    }

    @Test
    public void canDecreaseHp() {
        knight.decreaseHp(10);
        assertEquals(90, knight.getHp() );
    }

    @Test
    public void canAttack() {
        assertEquals(10, knight.attack(weapon1));
    }
}
