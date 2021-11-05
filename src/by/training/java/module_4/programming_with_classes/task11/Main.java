package by.training.java.module_4.programming_with_classes.task11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
        //консоль текст, заголовок текста.

        Text text = new Text();
        Sentence sentence = new Sentence(Arrays.asList(new Word("программы")));
        text.setTitle(sentence.getSentence());

        System.out.print("Заголовок текста: ");
        text.showTitle();

        Sentence sentence2 = new Sentence(Arrays.asList(
                new Word("хороший"),
                new Word("программист"),
                new Word("пишет"),
                new Word("хорошие"),
                new Word("программы"))
        );
        text.addSentence(sentence2);
        System.out.print("Исходный текст: ");
        text.showText();

        Sentence sentence3 = new Sentence(Arrays.asList(
                new Word("плохой"),
                new Word("программист"),
                new Word("пишет"),
                new Word("плохие"),
                new Word("программы"))
        );
        text.addSentence(sentence3);
        System.out.print("Дополненный текст: ");
        text.showText();
    }
}