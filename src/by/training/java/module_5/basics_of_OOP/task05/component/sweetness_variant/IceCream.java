package by.training.java.module_5.basics_of_OOP.task05.component.sweetness_variant;

import by.training.java.module_5.basics_of_OOP.task05.component.Sweetness;

public class IceCream implements Sweetness {

    private int price = 5;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Мороженное";
    }
}
