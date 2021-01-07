package com.company;

public class SamsungMotor extends Motor{

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Move Samsung Motor : " + direction);
    }

}
