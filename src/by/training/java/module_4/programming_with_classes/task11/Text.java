package by.training.java.module_4.programming_with_classes.task11;

import java.util.List;

public class Text {

    Sentence sentence = new Sentence();
    private List<Word> wordList;

    public void addText(Word word) {
        sentence.setSentence(word);
        wordList = sentence.getWordList();
    }

    public void getString() {
        for (Word word : wordList) {
            System.out.print(word.getWord() + " ");
        }
    }

    public List<Word> getWordList() {
        return wordList;
    }
}