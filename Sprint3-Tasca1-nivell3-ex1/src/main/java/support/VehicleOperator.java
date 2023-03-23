package support;

import interfaces.Command;
import interfaces.Vehicle;

public class VehicleOperator implements Command {


    private Vehicle myVehicle;

    public VehicleOperator(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    @Override
    public void executeStart() {
        myVehicle.start();
    }

    @Override
    public void executeAcc() {
        myVehicle.accelerate();
    }

    @Override
    public void executeBrake() {
        myVehicle.brake();
    }


}
