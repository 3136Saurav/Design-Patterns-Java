package learn.java.behavioral.observer.observer;

import learn.java.behavioral.observer.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private String emailId;
    private StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is now available! Hurry Now!");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Email sent to: " + emailId);
    }
}
