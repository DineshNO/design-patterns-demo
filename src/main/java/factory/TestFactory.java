package factory;

public class TestFactory {
    public static void main(String[] args) {
        MotorVehicleFactory carFactory = new CarFactory();
        MotorVehicle car = carFactory.create();
        car.build();

        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle motorcycle = motorcycleFactory.create();
        motorcycle.build();
    }
}
