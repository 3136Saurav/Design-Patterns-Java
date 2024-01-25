package learn.java.creational.singleton;

/*

Java Singleton Design Pattern Classes Example
- Runtime
- ActionServlet extends HttpServlet (getApplicationConfig) [uses MVC pattern]

public enum MySingleton {
    INSTANCE;
    private MySingleton() { }
}

// Access
MySingleton.INSTANCE

* */


import java.io.Serializable;

public class MySingleton implements Cloneable, Serializable {

    private volatile static MySingleton mySingletonObject;

    private MySingleton() {
        if (mySingletonObject != null) {
            throw new IllegalArgumentException("Object Already Created!");
        }
    }

    public static MySingleton getInstance() {
        if (mySingletonObject == null) {
            synchronized(MySingleton.class) {
                if (mySingletonObject == null) {
                    mySingletonObject = new MySingleton();
                }
            }
        }

        return mySingletonObject;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return mySingletonObject;
    }
}
