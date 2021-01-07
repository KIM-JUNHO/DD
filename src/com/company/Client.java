package com.company;

public class Client {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Lamp lamp = new Lamp();
        Button alarmButton = new Button(lamp, alarm);
        alarmButton.setMode(Mode.LAMP);
        alarmButton.pressed();
    }
}
