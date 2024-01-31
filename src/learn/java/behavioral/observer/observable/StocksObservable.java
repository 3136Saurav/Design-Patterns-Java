package learn.java.behavioral.observer.observable;

import learn.java.behavioral.observer.observer.NotificationAlertObserver;

/*

Observer Design Pattern: The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

JDK example -
            java.util.Observer and java.util.Observable
            java.beans.PropertyChangeListener



* */


public interface StocksObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStackCount(int newStockAdded);

    public int getStockCount();
}
