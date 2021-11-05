package by.training.java.module_4.programming_with_classes.task11;

public class Main {

    public static void main(String[] args) {

        //1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
        //консоль текст, заголовок текста.

        Text text = new Text();
        System.out.print("Заголовок текста: ");

        Word word = new Word("Программы");   // Заголовок текста
        text.addText(word);          // Добавляем новый элемент в коллекцию
        text.getString();            // Метод вывода на консоль

        text.getWordList().clear();  // Очистить коллекцию

        System.out.println("");
        System.out.print("Исходный текст: ");

        Word word2 = new Word("Хороший программист пишет хорошие программы");
        Word word3 = new Word("в добром здравии");
        text.addText(word2);
        text.getString();

        System.out.println("");
        System.out.print("Дополненный текст: ");
        text.addText(word3);
        text.getString();
    }
}