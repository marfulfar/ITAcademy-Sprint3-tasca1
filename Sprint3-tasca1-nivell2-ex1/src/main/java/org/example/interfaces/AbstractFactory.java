package org.example.interfaces;

public interface AbstractFactory {

    IAddress getAddress(String country);
    IPhone getPhone(String country);

}
