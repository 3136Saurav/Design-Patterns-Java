package learn.java.creational.abstractfactory;

import learn.java.creational.abstractfactory.factory.GUIFactory;
import learn.java.creational.abstractfactory.factory.MacFactory;
import learn.java.creational.abstractfactory.factory.WinFactory;

import java.util.Random;

public class AbstractFactoryDriver {

    public static void main(String[] args) {
        String[] osTypes = {"Windows", "Mac"};

        Random random = new Random();
        int randomIndex = random.nextInt(2);

        String currOsType = osTypes[randomIndex];

        GUIFactory factory = null;

        if ("Windows".equals(currOsType)) {
            factory = new WinFactory();
        } else if ("Mac".equals(currOsType)) {
            factory = new MacFactory();
        } else {
            System.out.println("OS not supported!");
        }

        Application application = new Application(factory);
        application.createUI();
        application.render();
    }
}
