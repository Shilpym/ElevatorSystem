package org.example.domain;

public class Display {

    private int floorNo;

    private Direction direction;

    public Display(int floorNo, Direction direction) {
        this.floorNo = floorNo;
        this.direction = direction;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public Direction getDirection() {
        return direction;
    }
}
