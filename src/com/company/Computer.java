package com.company;

public class Computer {
    private Keyboard keyboard;
    private Body body;
    private Monitor monitor;
    private Speaker speaker;

    public void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void addBody(Body body) {
        this.body = body;
    }

    public void addMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void addSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public int getPrice() {
        int keyboardPrice = keyboard.getPrice();
        int bodyPrice = body.getPrice();
        int monitorPrice = monitor.getPrice();
        int speakerPrice = speaker.getPrice();
        return keyboardPrice + bodyPrice + monitorPrice + speakerPrice;
    }

    public int getPower() {
        int keyboardPower = keyboard.getPower();
        int bodyPower = body.getPower();
        int monitorPower = monitor.getPower();
        int speakerPower = speaker.getPower();
        return keyboardPower + bodyPower + monitorPower + speakerPower;
    }
}
