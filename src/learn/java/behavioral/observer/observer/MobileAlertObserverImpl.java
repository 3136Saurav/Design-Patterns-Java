package learn.java.behavioral.observer.observer;

import learn.java.behavioral.observer.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private StocksObservable stocksObservable;
    String userName;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is available! Hurry Up!!");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Mobile message sent to : " + userName);
    }
}
