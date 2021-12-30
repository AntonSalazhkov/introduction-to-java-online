package by.training.java.module_5.basics_of_OOP.task05.logic;

import by.training.java.module_5.basics_of_OOP.task05.component.Flower;
import by.training.java.module_5.basics_of_OOP.task05.component.flower_variant.Chamomile;
import by.training.java.module_5.basics_of_OOP.task05.component.flower_variant.Rose;
import by.training.java.module_5.basics_of_OOP.task05.component.flower_variant.Tulip;

import java.util.ArrayList;
import java.util.Scanner;

public class Bouquet extends Purchase {

    Scanner sc = new Scanner(System.in);
    private Flower[] flowers = {new Chamomile(), new Rose(), new Tulip()};
    private ArrayList<Bouquet> bouquet = new ArrayList<>();

    public Bouquet() {
        userChoiceBouquet();
    }

    public Bouquet(String thing, int price) {
        super.setThing(thing);
        super.setPrice(price);
    }

    public void userChoiceBouquet() {
        String number;

        do {
            System.out.print("1. Добавить цветок " + "| 2. Выбрать упаковку " + "| 3. Показать полученный букет "
                    + "| 0. Выход из подменю");

            System.out.print("\nСделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    flowerSelection();
                    break;
                case "2":
                    selectionOfPackaging();
                    break;
                case "3":
                    showPurchase();
                    break;
            }
        } while (!number.matches("[0]"));
    }

    public void flowerSelection() {
        boolean correctInput = false;

        System.out.println("Доступные цветы:");   // можно добавлять сколько угодно компонентов без изменения метода
        for (int i = 0; i < flowers.length; i++) {
            System.out.println(flowers[i].toString() + ", стоимостью: " + flowers[i].getPrice());
        }

        do {
            System.out.print("Сделайте свой выбор: ");
            String input = sc.nextLine();

            for (int i = 0; i < flowers.length; i++) {
                if (input.compareToIgnoreCase(flowers[i].toString()) == 0) {   // проверяем правильность ввода пользователя, без учета регистра
                    bouquet.add(new Bouquet(flowers[i].toString(), flowers[i].getPrice()));
                    correctInput = true;
                }
            }
            if (!correctInput) {
                System.out.println("Некорректный ввод, повторите ввод");
            }
        } while (!correctInput);
    }

    public void showPurchase() {
        int totalPrice = 0;            // общая стоимость покупки
        System.out.println("Выбранные товары: ");
        for (Bouquet b : this.bouquet) {
            System.out.println(b.getThing());
            totalPrice += b.getPrice();
        }
        totalPrice += getPricePackage();
        System.out.println("Выбранная упаковка: " + getNamePackage());
        System.out.println("Общая стоимость покупки: " + totalPrice);
    }
}
