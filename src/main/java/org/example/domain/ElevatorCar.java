package org.example.domain;

public class ElevatorCar {

    private int elevatorId;

    private Display display;

    private Direction direction;

    private State state;

    private int currentFloor;

    private InternalButton internalButton;

    public ElevatorCar() {
        this.elevatorId = 1;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public Display getDisplay() {
        return display;
    }

    public Direction getDirection() {
        return direction;
    }

    public State getState() {
        return state;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void moveTo(int floorNo, Direction direction){
        this.direction = direction;
        System.out.println("Elevator moving towards floor "+ floorNo);
        this.currentFloor = floorNo;
        this.display = new Display(floorNo, direction);
        System.out.println("Elevator reached floor "+ floorNo);
    }

    public void moveToFloorInternally(int floorNo){
        Direction direction = Direction.UP;
        //direction will be calculated depending on current floor and which floor is selected
        internalButton.pressButton(this.elevatorId, floorNo, direction);
    }
}
