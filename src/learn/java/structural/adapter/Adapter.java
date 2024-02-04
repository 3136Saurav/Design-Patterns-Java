package learn.java.structural.adapter;

/*

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.

Bridge between existing and expected interface.

Examples - Power Adapter and socket, XML to JSON parser, Weighing Machine(pounds to kg)


The Adapter pattern involves three main components -:
a) Target: This represents the interface or class that the client code expects to work with. It defines the operations that the client can use.

b) Adaptee: This refers to the existing class or interface that needs to be adapted. It has a different interface that is incompatible with the client’s expectations.

c) Adapter: This is the class that bridges the gap between the Target and Adaptee. It implements the Target interface and internally uses an instance of the Adaptee to perform the desired operations. The Adapter class acts as a wrapper or translator, adapting the Adaptee’s interface to match the Target interface.

JDK examples -

*/

public class Adapter {
}
