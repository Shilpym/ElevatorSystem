package org.example.domain;

import java.util.List;

public class ExternalButtonDispatcher {

    List<ElevatorController> elevatorControllerList;

    public ExternalButtonDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitNewReq(int floorNo, Direction direction){
        //perform an external btn dispatcher algo and add the request to specific elevator
        elevatorControllerList.get(2).submitNewReq(floorNo, direction);
    }
}
