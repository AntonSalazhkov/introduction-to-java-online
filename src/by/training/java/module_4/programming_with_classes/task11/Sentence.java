package by.training.java.module_4.programming_with_classes.task11;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    List<Word> wordList = new ArrayList<>();

    public void setSentence(Word word) {
        wordList.add(word);
    }

    public List<Word> getWordList() {
        return wordList;
    }
}