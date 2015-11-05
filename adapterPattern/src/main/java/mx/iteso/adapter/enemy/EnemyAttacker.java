package mx.iteso.adapter.enemy;

// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new
// classes compatible with this one.

public interface EnemyAttacker {

     String fireWeapon();

     String driveForward();

     String assignDriver(String driverName);

}