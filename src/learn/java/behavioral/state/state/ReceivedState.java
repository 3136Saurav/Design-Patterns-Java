package learn.java.behavioral.state.state;

import learn.java.behavioral.state.courier.Courier;

public class ReceivedState implements CourierState {
    @Override
    public void previousState(Courier courier) {
        courier.setCourierState(new DeliveredState());
    }

    @Override
    public void nextState(Courier courier) {
        System.out.println("Courier already received by client!");
    }

    @Override
    public void printStatus() {
        System.out.println("Courier received!");
    }
}
