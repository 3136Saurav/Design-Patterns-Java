package learn.java.creational.abstractfactory.factory;

import learn.java.creational.abstractfactory.products.Button;
import learn.java.creational.abstractfactory.products.Checkbox;
import learn.java.creational.abstractfactory.products.concrete.WinButton;
import learn.java.creational.abstractfactory.products.concrete.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckbox();
    }
}