package learn.java.behavioral.observer;

import learn.java.behavioral.observer.observable.IphoneObservableImpl;
import learn.java.behavioral.observer.observable.StocksObservable;
import learn.java.behavioral.observer.observer.EmailAlertObserverImpl;
import learn.java.behavioral.observer.observer.MobileAlertObserverImpl;
import learn.java.behavioral.observer.observer.NotificationAlertObserver;

public class ObserverPatternDriver {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@xyz.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("pqr@ijk.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Scott", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStackCount(10);
    }
}
