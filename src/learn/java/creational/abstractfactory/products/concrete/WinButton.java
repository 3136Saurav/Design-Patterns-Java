package learn.java.creational.abstractfactory.products.concrete;

import learn.java.creational.abstractfactory.products.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint using WinButton");
    }
}
