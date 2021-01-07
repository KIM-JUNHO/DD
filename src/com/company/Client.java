package com.company;

public class Client {

    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();

        RoadDisplay roadWithlane = new RoadDisplayWithLane();
        roadWithlane.draw();
    }
}
