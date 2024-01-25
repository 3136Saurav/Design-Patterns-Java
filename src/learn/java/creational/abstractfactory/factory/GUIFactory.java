package learn.java.creational.abstractfactory.factory;

import learn.java.creational.abstractfactory.products.Button;
import learn.java.creational.abstractfactory.products.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
