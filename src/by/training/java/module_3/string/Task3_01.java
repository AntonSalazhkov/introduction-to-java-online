package by.training.java.module_3.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3_01 {

    public static void main(String[] args) {

        // Работа с регулярными выражениями Pattern, Matcher

        // 1. Создать приложение, разбирающее текст (текст хранится в строке)
        // и позволяющее выполнять с текстом три различных операции:
        // отсортировать абзацы по количеству предложений;
        // в каждом предложении отсортировать слова по длине;
        // отсортировать лексемы в предложении по убыванию количества вхождений заданного
        // символа, а в случае равенства – по алфавиту.

        String text = "\n\tЗакончив университет и получив диплом, я решил начать искать подходящую по специальности работу.\n"
                + "\tК сожалению, у меня сразу не получилось занять высокий пост. Все как в один голос твердили,\n"
                + "что у меня недостаточно практики, поэтому сначала нужно получить практические знания и поработать\n"
                + "несколько месяцев стажером. Я так и сделал.\n"
                + "\tПосетив одну фирму в обрабатывающей промышленности, мне очень понравился не только коллектив и\n"
                + "месторасположение компании, но и уровень заработной платы и перспектива роста. Именно поэтому я\n"
                + "принял для себя решение получить эту работу, чего бы мне это ни стоило.\n"
                + "\tКак оказалось, это сделать было не так-то просто.\n";

        System.out.print("Заданный текст: " + text);

        Pattern pattern = Pattern.compile("\\t");
        String regex = "\\.*[.!?;]\\s*";

        Menu(pattern, text, regex);

    }

    public static void Menu(Pattern pattern, String text, String regex) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВыберите пункт меню:"
                + "\n1. Отсортировать абзацы по количеству предложений (по возрастанию)."
                + "\n2. В предложениях отсортировать слова по длине."
                + "\n3. В каждом предложении отсортировать лексемы по убыванию количества\n"
                + "вхождений заданного символа, а в случае равенства - по алфавиту."
                + "\n0. Окончание работы программы.\n");

        String number;

        do {
            System.out.print("\nПожалуйста, сделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    sortParagraphs(pattern, text, regex);
                    break;
                case "2":
                    sortWords(text, regex);
                    break;
                case "3":
                    sortLexemes(text, regex);
                    break;
                case "0":
                    System.out.println("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }

    public static void sortParagraphs(Pattern pattern, String text, String regex) {

        String[] paragraphsArray = pattern.split(text);
        boolean cycle = false;
        String currentString;

        while (!cycle) {         // пока не станет true, т.е. цикл пройдет не заходя в if
            cycle = true;
            for (int i = 0; i < paragraphsArray.length - 1; i++) {

                if (paragraphsArray[i].split(regex).length > paragraphsArray[i + 1].split(regex).length) {
                    currentString = paragraphsArray[i];               // временное присваивание текущего значения строки
                    paragraphsArray[i] = paragraphsArray[i + 1];      // текущему значению присваивается следующее
                    paragraphsArray[i + 1] = currentString;           // следующее значение присваивается текущему
                    cycle = false;                                       // возврат sh к false для повтора цикла
                }
            }
        }
        currentString = "";
        for (int i = 0; i < paragraphsArray.length; i++) {     // Для окончательного вида приводим к строке с учетом табуляции
            currentString += '\t' + paragraphsArray[i];
        }
        System.out.print("Полученный текст: " + currentString);
    }

    public static void sortWords(String text, String regex) {
        String[] sentencesArray = text.split(regex); // предложения в массиве
        boolean cycle;
        String currentString;
        String[] wordsArray;

        System.out.println("Полученная сортировка предложений: ");
        for (int i = 0; i < sentencesArray.length; i++) {
            wordsArray = sentencesArray[i].replaceAll("\t|,", "").split("\\s"); // слова из одного предложения в массиве
            cycle = false;
            while (!cycle) {
                cycle = true;
                for (int k = 0; k < wordsArray.length - 1; k++) {
                    if (wordsArray[k].length() > wordsArray[k + 1].length()) {
                        currentString = wordsArray[k];
                        wordsArray[k] = wordsArray[k + 1];
                        wordsArray[k + 1] = currentString;
                        cycle = false;
                    }
                }
            }
            System.out.println(Arrays.toString(wordsArray));
        }
    }

    public static void sortLexemes(String text, String regex) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите символ >> ");
        String symbol = sc.nextLine();

        String[] sentencesArray = text.split(regex); // предложения в массиве
        boolean cycle;
        String currentString;
        String[] wordsArray;

        System.out.println("Полученная сортировка предложений: ");
        for (int i = 0; i < sentencesArray.length; i++) {
            wordsArray = sentencesArray[i].replaceAll("\t|,", "").split("\\s"); // предложение по словам

            cycle = false;
            while (!cycle) {
                cycle = true;
                for (int j = 0; j < wordsArray.length - 1; j++) {
                    if (wordsArray[j].replaceAll("[^" + symbol + "]", "").length() <
                            + wordsArray[j + 1].replaceAll("[^" + symbol + "]", "").length()) {
                        currentString = wordsArray[j];
                        wordsArray[j] = wordsArray[j + 1];
                        wordsArray[j + 1] = currentString;
                        cycle = false;
                    }
                }
                for (int j = 0; j < wordsArray.length - 1; j++) {
                    if (wordsArray[j].replaceAll("[^" + symbol + "]", "").length() ==
                            + wordsArray[j + 1].replaceAll("[^" + symbol + "]", "").length()) {
                        String[] sortArrayWords = {wordsArray[j], wordsArray[j + 1]};
                        Arrays.sort(sortArrayWords);
                        wordsArray[j] = sortArrayWords[0];
                        wordsArray[j + 1] = sortArrayWords[1];
                    }
                }
            }
            System.out.println(Arrays.toString(wordsArray));
        }
    }
}
