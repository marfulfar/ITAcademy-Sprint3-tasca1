package support;

import interfaces.Command;

public class Parking {
    Command myCommand;

    public void setMyCommand(Command myCommand) {
        this.myCommand = myCommand;
    }

    public void executeCommand(){
        myCommand.execute();
    }


}
