package org.example.singleton;

import java.util.ArrayList;

public class SingleUndo {

    private static SingleUndo instance;
    private static ArrayList<String> listCommands;
    private static ArrayList<String> removeList;

    private SingleUndo(){

        listCommands = new ArrayList<>();
        removeList = new ArrayList<>();

    };

    public static SingleUndo getInstance(){

        if(instance == null){
            instance = new SingleUndo();
        }

        return instance;
    }

    public void addLine(String line){
        listCommands.add(line);
    }

    public void removeLine(String line){
        removeList.add(line);
    }

    public void showAllHistory(){
        System.out.println(listCommands);
    }

    public void showDeletedHistory(){;
        System.out.println(removeList);
    }

    public void undoCommand(){
        if (listCommands.size()!=0){
            listCommands.remove(listCommands.size()-1);
            System.out.println("Last command undone!");
        }else{
            System.out.println("No commands to undo!");
        }
    }

}
