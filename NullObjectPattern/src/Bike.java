public class Bike implements Vehicle{
    @Override
    public void printFuelTankCapacity() {
        System.out.println("fuel tank capacity: 40");
    }

    @Override
    public void printNumberOfTires() {
        System.out.println("number of tires: 2");
    }
}
