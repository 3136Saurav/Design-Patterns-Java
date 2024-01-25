package learn.java.creational.factory.creator;

/*
Factory Design Pattern - Creational Design Pattern
- defines an interface for creating an object, but lets subclasses decide which class to instantiate.
- Factory Method lets a class defer instantiation to subclasses.

Java Classes - JDBC, Logging Frameworks (Log4j, Logback), Swing, JavaFX
https://stackoverflow.com/questions/7550612/in-simplest-terms-what-is-a-factory


Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

Pros -
You avoid tight coupling between the creator and the concrete products.
Single Responsibility Principle - You can move the product creation code into one place in the program, making the code easier to support.
Open/Closed Principle - You can introduce new types of products
into the program without breaking existing client code
*/


import learn.java.creational.factory.products.Pizza;

public abstract class PizzaStore {

    // SimplePizzaFactory factory;

    /* public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    } */

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // pizza = factory.createPizza(type); (Using Simple Pizza Factory)

        System.out.println("==================================================");
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("==================================================");
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
