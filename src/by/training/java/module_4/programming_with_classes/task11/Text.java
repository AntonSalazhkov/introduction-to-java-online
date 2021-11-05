package by.training.java.module_4.programming_with_classes.task11;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Sentence> sentenceList;
    private String title;

    public Text() {
        this.sentenceList = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        sentenceList.add(sentence);
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentenceList.size(); i++) {
            sb.append(sentenceList.get(i).getSentence());
            if (i != sentenceList.size() - 1) {
                // игнорировать " " после последнего предложения
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showTitle() {
        System.out.println(getTitle());
    }

    public void showText() {
        System.out.println(getText());
    }
}