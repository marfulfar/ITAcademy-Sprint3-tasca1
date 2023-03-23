package entities;

import interfaces.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting bike");

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating bike");

    }

    @Override
    public void brake() {
        System.out.println("Braking bike");
    }
}
