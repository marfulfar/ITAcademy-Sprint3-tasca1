package org.example;

import org.example.singleton.SingleUndo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;
        byte userChoice=0;
        boolean choice = false;
        SingleUndo myUndo = SingleUndo.getInstance();

        while(!choice) {
            System.out.println("Choose your option:\n1- Insert line\n2- Delete Line\n3- See history of all commands\n4- Show history of deleted commands\n5- Undo command (Delete last command)\n0-Exit the app");
            userChoice = sc.nextByte();

            switch (userChoice) {
                case 1:
                    System.out.print("Type in the command you want to insert:");
                    userInput=sc.next();
                    myUndo.addLine(userInput);
                    break;
                case 2:
                    System.out.print("Type in the command you want to remove:");
                    userInput=sc.next();
                    myUndo.removeLine(userInput);
                    break;
                case 3:
                    System.out.println("History of all the commands");
                    myUndo.showAllHistory();
                    break;
                case 4:
                    System.out.println("History of all deleted commands");
                    myUndo.showDeletedHistory();
                    break;
                case 5:
                    myUndo.undoCommand();
                    break;
                case 0:
                    choice = true;
                    break;
                default:
                    System.out.println("you didn't choose a correct answer!");
            }
        }



    }//closes main


}//closes class