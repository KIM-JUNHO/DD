package com.company;

public class SamsungElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;

    private SamsungElevatorFactory() {
    }

    public static ElevatorFactory getInstance() {
        if (factory == null)
            factory = new SamsungElevatorFactory();
        return factory;
    }

    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}
