package learn.java.structural.decorator.toppings;

import learn.java.structural.decorator.pizza.BasePizza;

public class MushroomDecorator extends ToppingDecorator {

    public MushroomDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int calculateCost() {
        return this.pizza.calculateCost() + 20;
    }
}
