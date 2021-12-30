package by.training.java.module_5.basics_of_OOP.task05.logic;

import by.training.java.module_5.basics_of_OOP.task05.component.Sweetness;
import by.training.java.module_5.basics_of_OOP.task05.component.sweetness_variant.Cake;
import by.training.java.module_5.basics_of_OOP.task05.component.sweetness_variant.IceCream;
import by.training.java.module_5.basics_of_OOP.task05.component.sweetness_variant.SugarCube;

import java.util.ArrayList;
import java.util.Scanner;

public class Gift extends Purchase {

    Scanner sc = new Scanner(System.in);
    private Sweetness[] sweets = {new SugarCube(), new IceCream(), new Cake()};
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Gift() {
        userChoiceGift();
    }

    public Gift(String thing, int price) {
        super.setThing(thing);
        super.setPrice(price);
    }

    public void userChoiceGift() {
        String number;

        do {
            System.out.print("1. Добавить сладость " + "| 2. Выбрать упаковку " + "| 3. Показать полученный подарок "
                    + "| 0. Выход из подменю");

            System.out.print("\nСделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    sweetnessSelection();
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

    public void sweetnessSelection() {
        boolean correctInput = false;

        System.out.println("Доступные сладости:");  // можно добавлять сколько угодно компонентов без изменения метода
        for (int i = 0; i < sweets.length; i++) {
            System.out.println(sweets[i].toString() + ", стоимостью: " + sweets[i].getPrice());
        }

        do {
            System.out.print("Сделайте свой выбор: ");
            String input = sc.nextLine();

            for (int i = 0; i < sweets.length; i++) {
                if (input.compareToIgnoreCase(sweets[i].toString()) == 0) { // проверяем правильность ввода пользователя, без учета регистра
                    gifts.add(new Gift(sweets[i].toString(), sweets[i].getPrice()));
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
        for (Gift g : this.gifts) {
            System.out.println(g.getThing());
            totalPrice += g.getPrice();
        }
        totalPrice += getPricePackage();
        System.out.println("Выбранная упаковка: " + getNamePackage());
        System.out.println("Общая стоимость покупки: " + totalPrice);
    }
}
