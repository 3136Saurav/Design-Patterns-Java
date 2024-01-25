package learn.java.creational.factory.creator;

import learn.java.creational.factory.products.concrete.NYStyleCheesePizza;
import learn.java.creational.factory.products.concrete.NYStyleVeggiePizza;
import learn.java.creational.factory.products.Pizza;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
