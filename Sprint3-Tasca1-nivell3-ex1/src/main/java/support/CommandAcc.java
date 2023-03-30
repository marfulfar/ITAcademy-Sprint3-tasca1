package support;

import interfaces.Command;
import interfaces.Vehicle;

public class CommandAcc implements Command {

    private Vehicle myVehicle;


    public CommandAcc(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    @Override
    public void execute() {
        this.myVehicle.accelerate();
    }

}
