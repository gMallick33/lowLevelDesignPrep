public class Main {
    public static void main(String[] args) {
        WeightMachineAdapterInterface machine = new WeightMachineAdapterImpl(new WeightMachineImpl());
        double weight = machine.getWeightInKg();
        System.out.println(weight);
    }
}