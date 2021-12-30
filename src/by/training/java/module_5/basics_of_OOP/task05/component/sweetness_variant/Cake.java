package by.training.java.module_5.basics_of_OOP.task05.component.sweetness_variant;

import by.training.java.module_5.basics_of_OOP.task05.component.Sweetness;

public class Cake implements Sweetness {

    private int price = 20;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Торт";
    }
}
