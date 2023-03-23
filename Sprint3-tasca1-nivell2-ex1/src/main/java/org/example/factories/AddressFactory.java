package org.example.factories;

import org.example.interfaces.AbstractFactory;
import org.example.interfaces.IAddress;
import org.example.interfaces.IPhone;
import org.example.objects.SpainAddress;
import org.example.objects.USAAddress;

public class AddressFactory implements AbstractFactory {

    @Override
    public IAddress getAddress(String country) {
        if(country=="spain"){
            return new SpainAddress();
        } else if (country=="usa") {
            return new USAAddress();
        }
        return null;
    }

    @Override
    public IPhone getPhone(String country) {
        return null;
    }

}
