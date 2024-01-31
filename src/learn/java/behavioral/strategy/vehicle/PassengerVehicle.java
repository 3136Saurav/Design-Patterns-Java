package learn.java.behavioral.strategy.vehicle;

import learn.java.behavioral.strategy.driveStrategy.NormalDriveStrategyImpl;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDriveStrategyImpl());
    }
}
