package by.training.java.module_5.basics_of_OOP.task05.component.flower_variant;

import by.training.java.module_5.basics_of_OOP.task05.component.Flower;

public class Chamomile implements Flower {

    private int price = 1;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ромашка";
    }
}
