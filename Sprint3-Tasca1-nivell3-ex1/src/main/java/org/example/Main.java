package org.example;

import entities.Car;
import support.Parking;
import support.VehicleOperator;

public class Main {
    public static void main(String[] args) {

        Parking myParking = new Parking();
        myParking.setMyCommand(new VehicleOperator(new Car()));

        myParking.executeCommandStart();

        myParking.executeCommandAcc();

        myParking.executeCommandBrake();

    }
}