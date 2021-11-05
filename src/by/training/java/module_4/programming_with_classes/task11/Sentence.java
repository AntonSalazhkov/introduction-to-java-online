package by.training.java.module_4.programming_with_classes.task11;

import java.util.List;

public class Sentence {

    private List<Word> wordList;

    public Sentence(List<Word> wordList) {
        this.wordList = wordList;
    }

    // генерирует предложение со словами, разделенными " " и '.' в конце
    public String getSentence() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordList.size(); i++) {
            if (i == 0) {
                // делает заглавную букву для первой буквы в предложении
                if (wordList.get(i).getWord().length() == 1) {
                    sb.append(wordList.get(i).getWord().toUpperCase());
                } else {
                    String firstCharInCapital = wordList.get(i).getWord().substring(0, 1).toUpperCase()
                            + wordList.get(i).getWord().substring(1);
                    sb.append(firstCharInCapital);
                }
            } else {
                sb.append(wordList.get(i).getWord());
            }
            if (i != wordList.size() - 1) {
                // игнорировать " " после последнего слова
                sb.append(" ");
            }
        }
        sb.append(".");
        return sb.toString();
    }
}