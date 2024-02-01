package learn.java.behavioral.state.courier;

import learn.java.behavioral.state.state.CourierState;
import learn.java.behavioral.state.state.OrderedState;

public class Courier {
    private CourierState courierState = new OrderedState();

    public CourierState getCourierState() {
        return courierState;
    }

    public void setCourierState(CourierState courierState) {
        this.courierState = courierState;
    }

    public void previousState() {
        courierState.previousState(this);
    }

    public void nextState() {
        courierState.nextState(this);
    }

    public void printStatus() {
        courierState.printStatus();
    }
}
