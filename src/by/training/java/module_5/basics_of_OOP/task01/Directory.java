package by.training.java.module_5.basics_of_OOP.task01;

public class Directory {

    private String name;
    private String path;
    private String fullPath;

    public Directory() {
    }

    public Directory(String name, String path) {
        this.name = name;
        this.path = path;
        this.fullPath = path + name;
    }

    public void setName(String name) {
        this.name = name;
        this.fullPath = path + name;
    }

    public String getFullPath() {
        return fullPath;
    }

    @Override
    public String toString() {
        return "Текущий файл{" +
                "name='" + name + '\'' +
                ", path='" + fullPath + '}';
    }
}