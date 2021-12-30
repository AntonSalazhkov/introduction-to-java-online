package by.training.java.module_5.basics_of_OOP.task05.logic;

import by.training.java.module_5.basics_of_OOP.task05.component.Package;
import by.training.java.module_5.basics_of_OOP.task05.component.package_variant.Cheap;
import by.training.java.module_5.basics_of_OOP.task05.component.package_variant.Expensive;
import by.training.java.module_5.basics_of_OOP.task05.component.package_variant.Normal;

import java.util.Scanner;

public abstract class Purchase {

    private String thing;        // наименование предмета покупки
    private String namePackage;  // наименование упаковки
    private int pricePackage;    // стоимость упаковки
    private int price;           // стоимость покупки
    private Package[] packages = {new Cheap(), new Normal(), new Expensive()};


    public Purchase() {
    }

    public int getPricePackage() {
        return pricePackage;
    }

    public void setPricePackage(int pricePackage) {
        this.pricePackage = pricePackage;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String buy) {
        this.thing = buy;
    }

    public String getNamePackage() {
        return namePackage;
    }

    public void setNamePackage(String namePackage) {
        this.namePackage = namePackage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void showPurchase();

    public void selectionOfPackaging() {
        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;

        System.out.println("Доступные упаковки:"); // можно добавлять сколько угодно компонентов без изменения метода
        for (int i = 0; i < packages.length; i++) {
            System.out.println(packages[i].toString() + ", стоимостью: " + packages[i].getPrice());
        }
        do {
            System.out.print("Сделайте свой выбор: ");
            String input = sc.nextLine();

            for (int i = 0; i < packages.length; i++) {
                if (input.compareToIgnoreCase(packages[i].toString()) == 0) { // проверяем правильность ввода пользователя, без учета регистра
                    this.setNamePackage(packages[i].toString());
                    this.setPricePackage(packages[i].getPrice());
                    correctInput = true;
                }
            }
            if (!correctInput) {
                System.out.println("Некорректный ввод, повторите ввод");
            }
        } while (!correctInput);
    }
}
