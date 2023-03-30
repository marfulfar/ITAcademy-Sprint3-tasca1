package entities;

import interfaces.Vehicle;

public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting boat");

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating boat");

    }

    @Override
    public void brake() {
        System.out.println("Braking boat");

    }
}
