package by.training.java.module_5.basics_of_OOP.task01;

public class TextFile extends by.training.java.module_5.basics_of_OOP.task01.File {

    private StringBuilder content;
    private Directory directory;

    public TextFile(Directory directory) {
        this.directory = directory;
    }

    public void contentFile(String content) {
        this.content = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            this.content.append(content.charAt(i));
        }
        this.content.append('\n');
    }

    public String getContent() {
        return content.toString();
    }

    public Directory getDirectory() {
        return directory;
    }
}
