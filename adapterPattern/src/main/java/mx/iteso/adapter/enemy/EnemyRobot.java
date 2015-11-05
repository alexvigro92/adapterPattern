package mx.iteso.adapter.enemy;

// This is the Adaptee. The Adapter sends method calls
// to objects that use the EnemyAttacker interface
// to the right methods defined in EnemyRobot

public interface EnemyRobot {

     String smashWithHands();

     String walkForward();

     String reactToHuman(String driverName);

}