package com.company;

public class Sungard extends Robot {
    public Sungard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have Missile.");
    }

    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
