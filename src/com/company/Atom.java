package com.company;

public class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have strong punch.");
    }

    @Override
    public void move() {
        System.out.println("I can fly.");
    }
}
