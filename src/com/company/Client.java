package com.company;

public class Client {

    public static void main(String[] args) {
        ElevatorFactory factory = null;
        String vendorName = "lg";

        if(vendorName.equalsIgnoreCase("LG"))
            factory = new LGElevatorFactory();
        else
            factory = new HyundaiElevatorFactory();

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
