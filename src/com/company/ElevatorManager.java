package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
    }

    // 팩토리 메서드: 스케줄링 전략 객체를 생성하는 기능 제공
    protected abstract ElevatorScheduler getScheduler();

    // 템플릿 메서드: 요청에 따라 엘리베이터를 선택하고 이동시킴
    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = getScheduler();   // primitive 또는 hook 메서드
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
