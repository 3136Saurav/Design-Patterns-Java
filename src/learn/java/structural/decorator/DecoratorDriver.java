package learn.java.structural.decorator;

import learn.java.structural.decorator.pizza.BasePizza;
import learn.java.structural.decorator.pizza.Margherita;
import learn.java.structural.decorator.toppings.CheeseDecorator;
import learn.java.structural.decorator.toppings.RedPepperDecorator;

public class DecoratorDriver {


    public static void main(String[] args) {
        BasePizza margheritaPizza = new Margherita();
        System.out.println(margheritaPizza.calculateCost());

        BasePizza cheeseMargheritaPizza = new CheeseDecorator(margheritaPizza);
        System.out.println(cheeseMargheritaPizza.calculateCost());

        BasePizza redPepperCheeseMargheritaPizza = new RedPepperDecorator(new CheeseDecorator(margheritaPizza));
        System.out.println(redPepperCheeseMargheritaPizza.calculateCost());


    }


}
