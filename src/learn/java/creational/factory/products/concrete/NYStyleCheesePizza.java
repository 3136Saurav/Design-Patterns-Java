package learn.java.creational.factory.products.concrete;

import learn.java.creational.factory.products.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

