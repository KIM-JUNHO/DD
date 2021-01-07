package com.company;

public class Client {

    public static void main(String[] args) {
        Display roadWithCrossingLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
        roadWithCrossingLaneAndTraffic.draw();
    }
}
