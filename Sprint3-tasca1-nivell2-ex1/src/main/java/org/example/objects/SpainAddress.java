package org.example.objects;

import org.example.interfaces.IAddress;

public class SpainAddress implements IAddress {

    private String street;
    private int number;

    public SpainAddress() {
    }

    public SpainAddress(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String showAddress(String street, int number) {

        return "Spain address: " + street +" "+ number;
    }
}
