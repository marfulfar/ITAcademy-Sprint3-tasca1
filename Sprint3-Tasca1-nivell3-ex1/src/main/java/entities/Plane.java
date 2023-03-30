package entities;

import interfaces.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting plane");

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating plane");

    }

    @Override
    public void brake() {
        System.out.println("Braking plane");

    }
}
