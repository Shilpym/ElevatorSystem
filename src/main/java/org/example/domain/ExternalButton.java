package org.example.domain;

public class ExternalButton {

    private ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButton(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void submitNewReq(int floorNo, Direction direction){
        externalButtonDispatcher.submitNewReq(floorNo, direction);
    }
}
