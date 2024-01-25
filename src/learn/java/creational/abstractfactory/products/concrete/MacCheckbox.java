package learn.java.creational.abstractfactory.products.concrete;

import learn.java.creational.abstractfactory.products.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint using MacCheckbox");
    }
}
