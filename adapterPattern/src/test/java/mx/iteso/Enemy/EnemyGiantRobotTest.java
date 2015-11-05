package mx.iteso.Enemy;

import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 11/4/2015.
 */
public class EnemyGiantRobotTest{

    private EnemyGiantRobot enemyGiantRobot;

    @Before
    public void setUp() {
        enemyGiantRobot = new EnemyGiantRobot();
    }

    @Test
    public void smashWithHandsTest() {
        assertEquals("Enemy Robot Causes Damage With Its Hands", enemyGiantRobot.smashWithHands());
    }

    @Test
    public void walkForwardTest() {
        assertEquals("Enemy Robot Walks Forward", enemyGiantRobot.walkForward());
    }

    @Test
    public void testReactToHuman() {
        String s = enemyGiantRobot.reactToHuman("Federico");
        assertEquals("Enemy Robot Tramps on Federico", s);
    }

}