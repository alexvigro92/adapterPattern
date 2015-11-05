package mx.iteso.Enemy;

import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 11/4/2015.
 */
public class EnemyRobotAdapterTest {

        private EnemyRobotAdapter RobotAdapter;
        private EnemyRobot Robot;

        @Before
        public void setUp() {
            Robot = mock(EnemyRobot.class);
            RobotAdapter = new EnemyRobotAdapter(Robot);
        }

        @Test
        public void testFireWeapon() {
            when(Robot.smashWithHands()).thenReturn("Enemy Robot Causes Damage With Its Hands");
            assertEquals("Enemy Robot Causes Damage With Its Hands", RobotAdapter.fireWeapon());
        }

        @Test
        public void testDriveForward() {
            when(Robot.walkForward()).thenReturn("Enemy Robot Walks Forward");
            assertEquals("Enemy Robot Walks Forward", RobotAdapter.driveForward());
        }

        @Test
        public void testAssignDriver() {
            when(Robot.reactToHuman("Federico")).thenReturn("Enemy Robot Tramps on Federico");
            assertEquals("Enemy Robot Tramps on Federico", RobotAdapter.assignDriver("Federico"));
        }

    }
