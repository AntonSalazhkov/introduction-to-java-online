package by.training.java.module_5.basics_of_OOP.task05.component.package_variant;

import by.training.java.module_5.basics_of_OOP.task05.component.Package;

public class Normal implements Package {

    private int price = 5;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Обычная";
    }
}
