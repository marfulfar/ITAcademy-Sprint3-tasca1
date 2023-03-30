package support;

import interfaces.Command;
import interfaces.Vehicle;

public class CommandStart implements Command {

    private Vehicle myVehicle;


    public CommandStart(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    @Override
    public void execute() {
        this.myVehicle.start();
    }




}

