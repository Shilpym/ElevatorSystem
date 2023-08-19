package org.example.domain;

import java.util.List;
import java.util.Optional;

public class InternalButtonDispatcher {

    private List<ElevatorController> elevatorControllerList;

    public InternalButtonDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitNewRequest(int elevatorId, int floorNo, Direction direction){
        Optional<ElevatorController> elevatorControllerOptional = elevatorControllerList.stream().filter(elevatorController -> elevatorController.getElevatorCar().getElevatorId() == elevatorId)
                .findAny();
        ElevatorController elevatorController = elevatorControllerOptional.get();
        elevatorController.submitNewReq(floorNo, direction);
    }
}
