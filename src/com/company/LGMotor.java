package com.company;

public class LGMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Move LG Motor : " + direction);
    }

}
