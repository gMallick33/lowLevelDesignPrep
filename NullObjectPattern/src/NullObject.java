public class NullObject implements Vehicle{
    @Override
    public void printFuelTankCapacity() {
        System.out.println("fuel tank capacity: 0");
    }

    @Override
    public void printNumberOfTires() {
        System.out.println("number of tires: 0");
    }
}
