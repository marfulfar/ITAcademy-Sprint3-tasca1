package org.example.objects;

import org.example.interfaces.IAddress;

public class USAAddress implements IAddress {

    private String street;
    private int number;


    public USAAddress() {
    }

    public USAAddress(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String showAddress(String street, int number) {

        return "USA address: " + number +" "+ street;
    }
}
