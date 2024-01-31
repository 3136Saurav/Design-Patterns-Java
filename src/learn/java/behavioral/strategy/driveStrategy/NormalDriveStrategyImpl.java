package learn.java.behavioral.strategy.driveStrategy;

public class NormalDriveStrategyImpl implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal car drive strategy!");
    }
}
