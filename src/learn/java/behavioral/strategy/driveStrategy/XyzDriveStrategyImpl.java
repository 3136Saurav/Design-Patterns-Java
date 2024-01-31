package learn.java.behavioral.strategy.driveStrategy;

public class XyzDriveStrategyImpl implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Xyz car drive strategy!");
    }
}
