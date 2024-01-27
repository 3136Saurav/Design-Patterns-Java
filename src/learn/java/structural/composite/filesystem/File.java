package learn.java.structural.composite.filesystem;

public class File implements FileSystem {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File name: " + fileName);
    }

}
