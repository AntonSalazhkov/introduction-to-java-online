package by.training.java.module_5.basics_of_OOP.task01;

public class File{

    private StringBuilder content;
    private Directory directory;

    public File () {}

    public File(Directory directory) {
        this.directory = directory;
    }

    public String contentFile(String content) {
        this.content = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            this.content.append(content.charAt(i));
        }
        this.content.append('\n');
        return content.toString();
    }

    public Directory getDirectory() {
        return directory;
    }
}
