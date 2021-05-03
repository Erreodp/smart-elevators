package com.company;

public class Elevator {

    private String name;

    private int currentFloor;

    public Elevator(String name, int currentFloor) throws Exception {
        this.name = name;
        this.currentFloor = currentFloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int calculateDistance(int callingFloor, int currentPosition) {

        return Math.abs(callingFloor - currentPosition);
    }

}
