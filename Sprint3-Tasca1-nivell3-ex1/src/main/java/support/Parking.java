package support;

import interfaces.Command;

public class Parking {
    Command myCommand;

    public Parking() {
    }

    public Parking(Command myCommand) {
        this.myCommand = myCommand;
    }


    public void setMyCommand(Command myCommand) {
        this.myCommand = myCommand;
    }


    public void executeCommandStart(){
        myCommand.executeStart();
    }

    public void executeCommandAcc(){
        myCommand.executeAcc();
    }

    public void executeCommandBrake(){
        myCommand.executeBrake();
    }


}
