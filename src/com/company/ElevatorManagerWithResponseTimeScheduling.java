package com.company;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {
    public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
        return scheduler;
    }
}
