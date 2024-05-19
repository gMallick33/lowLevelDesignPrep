public class WeightMachineAdapterImpl implements WeightMachineAdapterInterface{
    WeightMachineInterface weightMachine;
    WeightMachineAdapterImpl(WeightMachineInterface weightMachine) {
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        double weightInPounds = weightMachine.getWeightInPounds();
        double weightInKg = 0.45 * weightInPounds;
        return weightInKg;
    }
}
