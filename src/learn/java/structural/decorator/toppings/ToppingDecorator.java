package learn.java.structural.decorator.toppings;

import learn.java.structural.decorator.pizza.BasePizza;

/*
The Decorator Pattern attaches additional responsibilities to an object dynamically.
Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.

**/

public abstract class ToppingDecorator extends BasePizza {
    BasePizza pizza;
}
