package org.example;

import entities.Boat;
import entities.Car;
import entities.Plane;
import support.CommandAcc;
import support.CommandBrake;
import support.CommandStart;
import support.Parking;

public class Main {
    public static void main(String[] args) {

        Parking myParking = new Parking();

//Car
        myParking.setMyCommand(new CommandStart(new Car()));
        myParking.executeCommand();

//Boat

        myParking.setMyCommand(new CommandBrake(new Boat()));
        myParking.executeCommand();

//Plane

        myParking.setMyCommand(new CommandAcc(new Plane()));
        myParking.executeCommand();


    }
}