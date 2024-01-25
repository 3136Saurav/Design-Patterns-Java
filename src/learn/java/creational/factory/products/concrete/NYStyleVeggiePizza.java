package learn.java.creational.factory.products.concrete;

import learn.java.creational.factory.products.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough with oregano";
        sauce = "Mustard Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
