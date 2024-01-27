package learn.java.structural.decorator.toppings;

import learn.java.structural.decorator.pizza.BasePizza;

/*
The Decorator Pattern attaches additional responsibilities to an object dynamically.
Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.

Decorators have the same supertype as the objects they decorate.
You can use one or more decorators to wrap an object.
Given that the decorator has the same supertype as the object it decorates, we can  pass around a decorated object in place of the original (wrapped) object.
The decorator adds its own behavior before and/or after delegating to the object it  decorates to do the rest of the job.
Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like.

Decorator Pattern solves Class Explosion problem

The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

JDK Examples - All implementations of Reader and Writer in java.io: BufferedReader, BufferedWriter, FileReader, FileWriter

**/

public abstract class ToppingDecorator extends BasePizza {
    BasePizza pizza;
}
