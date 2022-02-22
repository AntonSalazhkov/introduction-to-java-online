package by.training.java.module_3.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_02 {

    public static void main(String[] args) {

        // 2. Дана строка, содержащая следующий текст (xml-документ):
        // Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его
        // тип (открывающий тег, закрывающий тег, содержимое тела, тег без тела). Пользоваться готовыми
        // парсерами XML для решения данной задачи нельзя.

        String xmlText = "<notes>\r\n"
                + " <note id = \"1\">\r\n"
                + "  <to>Вася</to>\r\n"
                + "  <from>Света</from>\r\n"
                + "  <heading>Напоминание</heading>\r\n"
                + "  <body>Позвони мне завтра!</body>\r\n"
                + " </note>\r\n"
                + " <note id = \"2\">\r\n"
                + "  <to>Петя</to>\r\n"
                + "  <from>Маша</from>\r\n"
                + "  <heading>Важное напоминание</heading>\r\n"
                + "  <body/>\r\n"
                + " </note>\r\n"
                + "</notes>";

        Pattern openTagPattern = Pattern.compile("<[^/]+?>");
        Pattern closeTagPattern = Pattern.compile("</.+?>");
        Pattern contentTagPattern = Pattern.compile(">.+?<");
        Pattern emptyTagPattern = Pattern.compile("<\\w.+/>");

        analyzerXML(xmlText, openTagPattern, closeTagPattern, contentTagPattern, emptyTagPattern);
    }

    public static void analyzerXML(String xmlText, Pattern openTagPattern, Pattern closeTagPattern,
                                   Pattern contentTagPattern, Pattern emptyTagPattern) {

        StringBuffer tagsOutput = new StringBuffer();
        Pattern oneString = Pattern.compile("\n");
        String[] wordsArray = oneString.split(xmlText);

        for (String line : wordsArray) {

            Matcher openTagMatcher = openTagPattern.matcher(line);
            Matcher closeTagMatcher = closeTagPattern.matcher(line);
            Matcher contentTagMatcher = contentTagPattern.matcher(line);
            Matcher emptyTagMatcher = emptyTagPattern.matcher(line);

            if (openTagMatcher.find()) {
                tagsOutput.append(openTagMatcher.group());
                tagsOutput.append(" - открывающий тег\n");
            }
            if (contentTagMatcher.find()) {
                tagsOutput.append(contentTagMatcher.group().substring(1));
                tagsOutput.append("\b - содержимое тега\n");
            }
            if (emptyTagMatcher.find()) {
                tagsOutput.append(emptyTagMatcher.group());
                tagsOutput.append(" - тег без тела\n");
            }
            if (closeTagMatcher.find()) {
                tagsOutput.append(closeTagMatcher.group());
                tagsOutput.append(" - закрывающий тег\n");
            }
        }
        System.out.println(tagsOutput);
    }
}