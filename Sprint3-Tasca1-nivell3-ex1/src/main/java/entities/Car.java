package entities;

import interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating car");

    }

    @Override
    public void brake() {
        System.out.println("Braking car");

    }
}
