package learn.java.structural.decorator.toppings;

import learn.java.structural.decorator.pizza.BasePizza;

public class RedPepperDecorator extends ToppingDecorator {

    public RedPepperDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int calculateCost() {
        return this.pizza.calculateCost() + 15;
    }
}
