public class Main {
    public static void main(String[] args) {
        Vehicle bike = VehicleFactory.getVehicleObject("BIKE");
        bike.printFuelTankCapacity();
        Vehicle v2 = VehicleFactory.getVehicleObject("CAR");
        v2.printNumberOfTires();
    }
}