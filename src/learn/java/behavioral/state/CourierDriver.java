package learn.java.behavioral.state;

import learn.java.behavioral.state.courier.Courier;

public class CourierDriver {
    public static void main(String[] args) {

        // Ordered State
        Courier courier = new Courier();
        courier.printStatus();

        // Delivered State
        courier.nextState();
        courier.printStatus();

        // ReceivedState
        courier.nextState();
        courier.printStatus();

    }
}
