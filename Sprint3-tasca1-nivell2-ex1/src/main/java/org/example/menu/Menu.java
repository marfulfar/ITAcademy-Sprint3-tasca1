package org.example.menu;

import java.util.Scanner;

public class Menu {

    public static Byte menu4Options(){
        Scanner sc = new Scanner(System.in);
        byte userOption;
        final byte MINIMUM = 0;
        final byte MAXIMUM = 5;

        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Insert new contact address");
            System.out.println("2. Insert new contact phone");
            System.out.println("3. Show all contacts addresses");
            System.out.println("4. Show all contacts phones");
            System.out.println("0. Exit the app.\n");
            userOption = sc.nextByte();
            if (userOption < MINIMUM || userOption > MAXIMUM) {
                System.out.println("Choose a valid option");
            }
        } while (userOption < MINIMUM || userOption > MAXIMUM);

        return userOption;
    }
}
