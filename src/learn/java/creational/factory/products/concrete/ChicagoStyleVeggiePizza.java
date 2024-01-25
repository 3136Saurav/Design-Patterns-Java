package learn.java.creational.factory.products.concrete;

import learn.java.creational.factory.products.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Chinese Sauce with cilantro";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cut the Pizza into four slices");
    }
}
