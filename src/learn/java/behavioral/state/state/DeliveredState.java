package learn.java.behavioral.state.state;

import learn.java.behavioral.state.courier.Courier;

public class DeliveredState implements CourierState {
    @Override
    public void previousState(Courier courier) {
        courier.setCourierState(new OrderedState());
    }

    @Override
    public void nextState(Courier courier) {
        courier.setCourierState(new ReceivedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Courier is in transit!");
    }
}
