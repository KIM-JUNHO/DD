package com.company;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Move LG Motor : " + direction);
    }

}
