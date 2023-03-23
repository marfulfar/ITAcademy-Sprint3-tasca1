package org.example.objects;

import org.example.interfaces.IPhone;

public class SpainPhone implements IPhone {

    @Override
    public String showPhone(int number) {

        return " +0034 - " + number;
    }
}
