package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        Elevator a = new Elevator("A",0);
        Elevator b = new Elevator("B", 10);
        Elevator c = new Elevator("C", 20);

        int callingFloor = 7;

        if (callingFloor > 20)
            throw new Exception("The value for callingFloor must be between 0 and 20");

        int distanceA = a.calculateDistance(callingFloor, a.getCurrentFloor());
        int distanceB = b.calculateDistance(callingFloor, b.getCurrentFloor());
        int distanceC = c.calculateDistance(callingFloor, c.getCurrentFloor());

        System.out.println("Calling floor: " + callingFloor);
        System.out.println("A current floor: " + a.getCurrentFloor() + " Distance to calling floor: " + distanceA);
        System.out.println("B current floor: " + b.getCurrentFloor() + " Distance to calling floor: " + distanceB);
        System.out.println("C current floor: " + c.getCurrentFloor() + " Distance to calling floor: " + distanceC);

        if (distanceA < distanceB) {
            if (distanceA < distanceC) {
                System.out.println("The responding elevator is: " + a.getName());
            } else {
                System.out.println("The responding elevator is: " + c.getName());
            }
        } else if (distanceB < distanceC) {
            System.out.println("The responding elevator is: " + b.getName());
        } else {
            System.out.println("The responding elevator is: " + c.getName());
        }
    }

}
