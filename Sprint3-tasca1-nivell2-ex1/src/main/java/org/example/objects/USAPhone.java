package org.example.objects;

import org.example.interfaces.IPhone;

public class USAPhone implements IPhone {
    @Override
    public String showPhone(int number) {

        return "+0001 - " + number;
    }
}
