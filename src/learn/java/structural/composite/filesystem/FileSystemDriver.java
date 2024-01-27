package learn.java.structural.composite.filesystem;

/*
Composite pattern is one of the Structural design pattern. Composite design pattern is used when we have to represent a part-whole hierarchy.

Use the pattern when you want the client code to treat both simple and complex elements uniformly.

A Decorator is like a Composite but only has one child component. There’s another significant difference: Decorator adds additional responsibilities to the wrapped object, while Composite just “sums up” its children.

JDK:=
AWT and Swing Components:
The components in the Abstract Window Toolkit (AWT) and Swing libraries often follow the Composite pattern. For instance, Container is a composite class that can contain other components (Component objects). Panel, Frame, and JPanel are examples of classes that extend Container and can contain other components.

*/

public class FileSystemDriver {

    public static void main(String[] args) {
        Directory rootDirectory = new Directory("root/");
        Directory comedyMovieDirectory = new Directory("comedy/");
        File idiots_3 = new File("3 Idiots");
        comedyMovieDirectory.add(idiots_3);

        rootDirectory.add(comedyMovieDirectory);
        rootDirectory.ls();
    }
}
