package learn.java.creational.abstractfactory.factory;

import learn.java.creational.abstractfactory.products.Button;
import learn.java.creational.abstractfactory.products.Checkbox;
import learn.java.creational.abstractfactory.products.concrete.MacButton;
import learn.java.creational.abstractfactory.products.concrete.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}
