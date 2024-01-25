package learn.java.creational.abstractfactory;

import learn.java.creational.abstractfactory.factory.GUIFactory;
import learn.java.creational.abstractfactory.products.Button;
import learn.java.creational.abstractfactory.products.Checkbox;

/*
Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
An Abstract Factory gives us an interface for creating a family of products. By writing code that uses this interface, we decouple our code
from the actual factory that creates the products. That allows us to implement a variety of factories that produce products meant for different
contexts—such as different regions, different operating systems, or different look and feels.

JDK - javax.xml.parsers.DocumentBuilderFactory

*/


public class Application {
    GUIFactory factory;
    Button button;
    Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }
}
