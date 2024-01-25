package learn.java.creational.factory.products;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;

    public List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing <" + name + ">");
        System.out.println("Tossing " + dough);
        System.out.println("Adding " + sauce);

        System.out.println("Adding Toppings - ");
        for (String topping : toppings) {
            System.out.print(topping + ", ");
        }

        System.out.println();
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
