package learn.java.behavioral.strategy.driveStrategy;

/*

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

JDK examples - java.util.Comparator, java.util.concurrent.Executor


*/


public interface DriveStrategy {
    public void drive();
}
