package learn.java.structural.decorator.toppings;

import learn.java.structural.decorator.pizza.BasePizza;

public class CheeseDecorator extends ToppingDecorator{

    public CheeseDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int calculateCost() {
        return this.pizza.calculateCost() + 25;
    }
}
