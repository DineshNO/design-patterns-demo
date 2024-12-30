package factory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Corporation corporation = new FutureVehicleCorporation();
        corporation.createMotorVehicle().build();
        corporation.createElectricVehicle().build();

        Corporation nextGenCorporation = new NextGenCorporation();
        nextGenCorporation.createMotorVehicle().build();
        nextGenCorporation.createElectricVehicle().build();
    }
}
