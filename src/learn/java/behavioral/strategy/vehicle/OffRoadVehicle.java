package learn.java.behavioral.strategy.vehicle;

import learn.java.behavioral.strategy.driveStrategy.XyzDriveStrategyImpl;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new XyzDriveStrategyImpl());
    }
}
