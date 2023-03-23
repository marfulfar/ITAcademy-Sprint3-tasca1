package org.example.factories;

import org.example.interfaces.AbstractFactory;
import org.example.interfaces.IAddress;
import org.example.interfaces.IPhone;
import org.example.objects.SpainPhone;
import org.example.objects.USAPhone;

public class PhoneFactory implements AbstractFactory {
    @Override
    public IAddress getAddress(String country) {
        return null;
    }

    @Override
    public IPhone getPhone(String country) {
        if(country=="spain"){
            return new SpainPhone();
        } else if (country=="usa") {
            return new USAPhone();
        }
        return null;
    }
}
