package org.example.main;

import org.example.factories.FactoryProducer;
import org.example.interfaces.AbstractFactory;
import org.example.interfaces.IAddress;
import org.example.interfaces.IPhone;
import org.example.utils.ScannerTools;

import java.util.ArrayList;

import static org.example.menu.Menu.menu4Options;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();
        ArrayList<String> phones = new ArrayList<>();


        boolean exit = false;

        do {
            switch (menu4Options()) {
                case 1:
                    insertAddressContact(contacts);
                    break;
                case 2:
                    insertPhoneContact(phones);
                    break;
                case 3:
                    for (String contact:contacts) {
                        System.out.println(contact);
                    }
                    break;
                case 4:
                    for (String number:phones) {
                        System.out.println(number);
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using this app!");
                    exit = true;
                    break;
            }
        } while (!exit);


        /*
        AbstractFactory myProducer2 = new FactoryProducer().getfactory("phone");
        IPhone myPhone = myProducer2.getPhone("spain");
        myPhone.showPhone();
        */


    }//closes main

    private static void insertPhoneContact(ArrayList<String> phones) {

        String userName = ScannerTools.scanString("Type in the name of the new contact");
        int userPhoneNum = ScannerTools.scanInt("Type in the phone number");
        int userCode = ScannerTools.scanInt("Type in the number in what the contact lives:\n1- spain\n2- usa");
        String userCountry ="";
        if (userCode==1){userCountry="spain";}else{userCountry="usa";};

        AbstractFactory myProducer = new FactoryProducer().getfactory("phone");
        IPhone myPhone = myProducer.getPhone(userCountry);
        String fullPhone = myPhone.showPhone(userPhoneNum);
        phones.add(userName +"-"+ fullPhone);

    }

    private static void insertAddressContact(ArrayList<String> contacts) {

        String userName = ScannerTools.scanString("Type in the name of the new contact");
        String userAddress = ScannerTools.scanString("Type in the address");
        int userNumAddress = ScannerTools.scanInt("Type in the number of the street");
        int userCode = ScannerTools.scanInt("Type in the number in what the contact lives:\n1- spain\n2- usa");
        String userCountry ="";
        if (userCode==1){userCountry="spain";}else{userCountry="usa";};

        AbstractFactory myProducer = new FactoryProducer().getfactory("address");
        IAddress myAddress = myProducer.getAddress(userCountry);
        myAddress.showAddress(userAddress,userNumAddress);
        contacts.add(userName +"-"+ myAddress.showAddress(userAddress,userNumAddress));


    }

}//closes class