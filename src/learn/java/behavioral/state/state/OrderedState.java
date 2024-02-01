package learn.java.behavioral.state.state;

import learn.java.behavioral.state.courier.Courier;

public class OrderedState implements CourierState {

    @Override
    public void previousState(Courier courier) {
        System.out.println("This courier is in its source station");
    }

    @Override
    public void nextState(Courier courier) {
        courier.setCourierState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been placed!");
    }
}
