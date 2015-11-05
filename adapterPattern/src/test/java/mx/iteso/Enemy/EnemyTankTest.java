package mx.iteso.Enemy;

import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 11/4/2015.
 */
public class EnemyTankTest {
    EnemyTank Tank;

    @Before
    public void setUP(){
        Tank = new EnemyTank();
    }

    @Test
    public void fireWeaponTest(){
        assertEquals("Enemy tank fires weapon",Tank.fireWeapon());
    }

    @Test
    public void driveForwardTest(){
        assertEquals("Enemy Tank moves forward",Tank.driveForward());
    }

    @Test
    public void assignDriverTest(){
        String s = Tank.assignDriver("Petroclo");
        assertEquals("Petroclo is driving the tank", s);
    }
}
