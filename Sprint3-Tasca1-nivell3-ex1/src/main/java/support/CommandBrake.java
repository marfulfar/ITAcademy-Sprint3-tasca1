package support;

import interfaces.Command;
import interfaces.Vehicle;

public class CommandBrake implements Command {

    private Vehicle myVehicle;


    public CommandBrake(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    @Override
    public void execute() {
        this.myVehicle.brake();
    }

}
