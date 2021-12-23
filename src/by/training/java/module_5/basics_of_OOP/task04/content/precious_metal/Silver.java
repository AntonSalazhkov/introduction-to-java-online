package by.training.java.module_5.basics_of_OOP.task04.content.precious_metal;

import by.training.java.module_5.basics_of_OOP.task04.content.Metal;

public class Silver implements Metal {

    private int price = 100;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Silver";
    }
}
