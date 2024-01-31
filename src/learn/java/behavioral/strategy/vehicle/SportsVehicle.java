package learn.java.behavioral.strategy.vehicle;

import learn.java.behavioral.strategy.driveStrategy.SportsDriveStrategyImpl;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategyImpl());
    }
}
