package learn.java.behavioral.strategy;

import learn.java.behavioral.strategy.vehicle.OffRoadVehicle;
import learn.java.behavioral.strategy.vehicle.PassengerVehicle;
import learn.java.behavioral.strategy.vehicle.SportsVehicle;

public class VehicleDriver {
    public static void main(String[] args) {
        PassengerVehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
