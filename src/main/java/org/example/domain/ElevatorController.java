package org.example.domain;

public class ElevatorController {

    private ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void submitNewReq(int floorNo, Direction direction){
        //apply some algo to add request to given elevator id and fulfil the request
        initiateAction(floorNo, direction);
    }

    private void initiateAction(int floorNo, Direction direction){
        elevatorCar.moveTo(floorNo, direction);
    }

}
