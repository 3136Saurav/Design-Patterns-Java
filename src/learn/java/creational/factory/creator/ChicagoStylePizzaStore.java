package learn.java.creational.factory.creator;

import learn.java.creational.factory.products.Pizza;
import learn.java.creational.factory.products.concrete.ChicagoStyleCheesePizza;
import learn.java.creational.factory.products.concrete.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }  else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
