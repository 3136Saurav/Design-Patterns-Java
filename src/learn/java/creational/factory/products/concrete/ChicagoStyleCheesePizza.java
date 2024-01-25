package learn.java.creational.factory.products.concrete;

import learn.java.creational.factory.products.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

     public void cut() {
        System.out.println("Cut the Pizza into four slices");
    }
}
