package org.example.factories;

import org.example.factories.AddressFactory;
import org.example.factories.PhoneFactory;
import org.example.interfaces.AbstractFactory;

public class FactoryProducer {

    public AbstractFactory getfactory(String typeFactory) {
        if (typeFactory=="address"){
            return new AddressFactory();
        }else if(typeFactory=="phone"){
            return new PhoneFactory();
        }

        return null;
    }

}
