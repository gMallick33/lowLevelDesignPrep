import withStrategy.OffRoad;
import withStrategy.Vehicle;
import withStrategy.strategy.SpecialDrive;

public class Main {
    public static void main(String[] args) {
        // with strategy:
        Vehicle offroadVehicle = new OffRoad(new SpecialDrive());
        offroadVehicle.drive();

    }
}