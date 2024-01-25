package learn.java.creational.factory;

import learn.java.creational.factory.creator.ChicagoStylePizzaStore;
import learn.java.creational.factory.creator.PizzaStore;
import learn.java.creational.factory.products.Pizza;
import learn.java.creational.factory.creator.NYStylePizzaStore;

public class PizzaFactoryDriver {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>>>> FACTORY <<<<<<<<<<<<<<");
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        Pizza nyCheesePizza = nyStylePizzaStore.orderPizza("cheese");

        Pizza chicagoVeggiePizza = chicagoStylePizzaStore.orderPizza("veggie");
        System.out.println("John ordered - " + nyCheesePizza.getName());
        System.out.println("Sam ordered - " + chicagoVeggiePizza.getName());

    }
}
