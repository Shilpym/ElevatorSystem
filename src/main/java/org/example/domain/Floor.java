package org.example.domain;

public class Floor {

    private  int floorNo;

    private ExternalButton externalButton;

    public Floor(int floorNo, ExternalButton externalButton) {
        this.floorNo = floorNo;
        this.externalButton = externalButton;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }
}
