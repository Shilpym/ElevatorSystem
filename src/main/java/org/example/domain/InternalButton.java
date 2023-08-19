package org.example.domain;

public class InternalButton {

    private InternalButtonDispatcher internalButtonDispatcher;

    public InternalButton(InternalButtonDispatcher internalButtonDispatcher) {
        this.internalButtonDispatcher = internalButtonDispatcher;
    }

    public void pressButton(int elevatorId, int floorNo, Direction direction){
        internalButtonDispatcher.submitNewRequest(elevatorId, floorNo,direction);
    }
}
