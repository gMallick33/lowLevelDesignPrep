package withStrategy;

import withStrategy.strategy.DriveStrategy;

public class OffRoad extends Vehicle{
    public OffRoad(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
