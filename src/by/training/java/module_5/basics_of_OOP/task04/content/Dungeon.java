package by.training.java.module_5.basics_of_OOP.task04.content;

import java.util.ArrayList;

public class Dungeon {

    private ArrayList<Treasure> treasures = new ArrayList();

    public Dungeon() {

        for (int i = 1; i <= 100; i++) {
            Treasure treasure = new Treasure(i);
            treasures.add(treasure);
        }
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
