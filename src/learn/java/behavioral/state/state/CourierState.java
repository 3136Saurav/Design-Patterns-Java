package learn.java.behavioral.state.state;


/*

The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.

Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.

JDK examples - java.awt.Component and java.awt.Container, javax.faces.lifecycle.Lifecycle

*/

import learn.java.behavioral.state.courier.Courier;

public interface CourierState {
    public void previousState(Courier courier);
    public void nextState(Courier courier);
    public void printStatus();
}
