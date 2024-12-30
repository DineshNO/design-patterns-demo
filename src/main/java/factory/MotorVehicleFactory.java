package factory;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return createMotorVehicle();
    }

    protected abstract MotorVehicle createMotorVehicle();
}
