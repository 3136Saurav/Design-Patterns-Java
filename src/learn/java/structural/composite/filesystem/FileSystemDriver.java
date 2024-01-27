package learn.java.structural.composite.filesystem;

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
