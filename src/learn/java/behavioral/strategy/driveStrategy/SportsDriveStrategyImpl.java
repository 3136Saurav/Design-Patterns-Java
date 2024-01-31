package learn.java.behavioral.strategy.driveStrategy;

public class SportsDriveStrategyImpl implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports car drive strategy!");
    }
}
