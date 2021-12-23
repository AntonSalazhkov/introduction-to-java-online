package by.training.java.module_5.basics_of_OOP.task04.logic;

import by.training.java.module_5.basics_of_OOP.task04.content.Dungeon;

public class Choice extends TextFile {

    Dungeon dungeon = new Dungeon();

    public Choice() {
    }

    public boolean create() {
        boolean successOfCreation = createFile();
        addFile(dungeon.getTreasures().toString());
        return successOfCreation;
    }

    public void viewingTreasures() {
        printContent();
    }

    public void choosingTheExpensive() {
        int maxPrice = dungeon.getTreasures().get(0).getPrice();
        for (int i = 0; i < dungeon.getTreasures().size() - 1; i++) {    // находим самое дорогое сокровище
            if (dungeon.getTreasures().get(i).getPrice() > maxPrice) {
                maxPrice = dungeon.getTreasures().get(i).getPrice();
            }
        }
        for (int i = 0; i < dungeon.getTreasures().size() - 1; i++) {    // выводим самое дорогое сокровище или несколько, если их несколько
            if (dungeon.getTreasures().get(i).getPrice() == maxPrice) {
                System.out.println(dungeon.getTreasures().get(i));
            }
        }
    }

    public boolean choiceByAmount(String number) {
        boolean positiveResult = false;
        for (int i = 0; i < dungeon.getTreasures().size(); i++) {
            if (number.matches("\\d+") && Integer.parseInt(number) == dungeon.getTreasures().get(i).getPrice()) {
                System.out.println(dungeon.getTreasures().get(i));
                positiveResult = true;
            }
        }

        if (number.matches("\\d+") && !positiveResult) {
            System.out.println("Точных совпадений не найдено, наиболее близкий результат: ");

            int currentNumber = Integer.parseInt(number);

            int descendingNumber = currentNumber;   // число по убыванию

            while (!positiveResult) {               // находим ближайшее число по убыванию
                descendingNumber--;
                for (int i = 0; i < dungeon.getTreasures().size(); i++) {
                    if (descendingNumber == dungeon.getTreasures().get(i).getPrice()) {
                        positiveResult = true;
                        break;
                    }
                }
            }
            positiveResult = false;
            int ascendingNumber = currentNumber;   // число по возрастанию

            while (!positiveResult) {              // находим ближайшее число по возрастанию
                ascendingNumber++;
                for (int i = 0; i < dungeon.getTreasures().size(); i++) {
                    if (ascendingNumber == dungeon.getTreasures().get(i).getPrice()) {
                        positiveResult = true;
                        break;
                    }
                }
            }
            if (Math.abs(currentNumber - descendingNumber) < Math.abs(currentNumber - ascendingNumber)) {
                for (int i = 0; i < dungeon.getTreasures().size(); i++) {
                    if (descendingNumber == dungeon.getTreasures().get(i).getPrice()) {
                        System.out.println(dungeon.getTreasures().get(i));
                    }
                }
            } else if (Math.abs(currentNumber - descendingNumber) > Math.abs(currentNumber - ascendingNumber)) {
                for (int i = 0; i < dungeon.getTreasures().size(); i++) {
                    if (ascendingNumber == dungeon.getTreasures().get(i).getPrice()) {
                        System.out.println(dungeon.getTreasures().get(i));
                    }
                }
            } else if (Math.abs(currentNumber - descendingNumber) == Math.abs(currentNumber - ascendingNumber)) {
                for (int i = 0; i < dungeon.getTreasures().size(); i++) {
                    if (descendingNumber == dungeon.getTreasures().get(i).getPrice() || ascendingNumber == dungeon.getTreasures().get(i).getPrice()) {
                        System.out.println(dungeon.getTreasures().get(i));
                    }
                }
            }
        }
        return positiveResult;
    }
}
