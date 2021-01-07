package com.company;

public enum SingletonTest {
    INSTANCE;

    public static SingletonTest getInstance() {
        return INSTANCE;
    }
}
