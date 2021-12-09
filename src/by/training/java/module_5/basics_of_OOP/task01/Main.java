package by.training.java.module_5.basics_of_OOP.task01;

public class Main {

    public static void main(String[] args) {
        // 1. Создать обьект класса Текстовый файл, используя классы Файл, Директория.
        // Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

        String fileSeparator = System.getProperty("file.separator");

        File file = new File(new Directory("text.txt", "E:" + fileSeparator));
        TextFile textFile = new TextFile();

        System.out.println(file.getDirectory().toString());   // текущее имя и директория

        System.out.println("Создать файл:");
        textFile.createFile(file.getDirectory().getFullPath());


        System.out.println("Переименовать файл:");
        String newFileName = "text2.txt";
        file.getDirectory().setName(newFileName);
        textFile.renameFile(file.getDirectory().getFullPath());


        System.out.println("Дополнить файл текстом:");
        textFile.addFile(textFile.contentFile("текст текст текст"));


        System.out.println("Содержимое файла: ");
        textFile.printContent();


        System.out.println(file.getDirectory().toString());  // текущее имя и директория


        System.out.println("Удалить файл:");
        textFile.deleteFile();
    }
}
