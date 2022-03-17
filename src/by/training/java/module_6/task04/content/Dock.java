package by.training.java.module_6.task04.content;

import by.training.java.module_6.task04.logic.Port;

public class Dock implements Runnable {

    Ship ship = null;    // Переменная хранящая корабль, она будет переписываться после каждого цикла

    @Override
    public void run() {

        System.out.println("Док " + Thread.currentThread().getName() + " активирован");

        try {

            while (true) {                       // постоянный цикл
                ship = Port.queue.take();        // Присваивание переменной ship элемента из очереди

                Thread.sleep(1000);        // Ожидание 1 сек

                if (Port.currentQuantityCargo != 0 && ship.getCurrentQuantityCargo() != ship.getCarryingCapacity()) {
                    System.out.println(Thread.currentThread().getName() + " Началась загрузка " + ship.getNumberShip()
                            + " корабля");

                    boolean correctLoading = true;
                    while (correctLoading) {            // Загрузка контейнеров на корабль
                        if (Port.currentQuantityCargo != 0 && ship.getCurrentQuantityCargo() < ship.getCarryingCapacity()) {
                            ship.setCurrentQuantityCargo(ship.getCurrentQuantityCargo() + 1);
                            Port.currentQuantityCargo -= 1;

                        } else if (Port.currentQuantityCargo == 0) {
                            System.out.println("Порт пуст, в порту " + Port.currentQuantityCargo
                                    + " груза из " + Port.capacity + " возможных" + "\n");
                            correctLoading = false;
                            Thread.sleep(2000);
                        } else {
                            correctLoading = false;
                            Thread.sleep(2000);
                        }
                    }

                    if (ship.getCurrentQuantityCargo() == ship.getCarryingCapacity()) {
                        System.out.println("Корабль " + ship.getNumberShip() + " загружен и отбыл.");
                    } else {
                        System.out.println("В виду отсутствия / переполнения груза в порту корабль "
                                + ship.getNumberShip() + " отбыл с остатком груза " + ship.getCurrentQuantityCargo());
                    }

                    Thread.sleep(2000);

                } else {
                    System.out.println(Thread.currentThread().getName() + " Началась разгрузка " + ship.getNumberShip()
                            + " корабля");

                    boolean correctLoading = true;
                    while (correctLoading) {          // Разгрузка контейнеров в порт
                        if (Port.currentQuantityCargo < Port.capacity && ship.getCurrentQuantityCargo() != 0) {
                            ship.setCurrentQuantityCargo(ship.getCurrentQuantityCargo() - 1);
                            Port.currentQuantityCargo += 1;

                        } else if (Port.currentQuantityCargo == Port.capacity) {
                            System.out.println("Порт полон, в порту " + Port.currentQuantityCargo
                                    + " груза из " + Port.capacity + " возможных" + "\n");
                            correctLoading = false;
                            Thread.sleep(2000);
                        } else {
                            correctLoading = false;
                            Thread.sleep(2000);
                        }
                    }

                    if (ship.getCurrentQuantityCargo() == 0) {
                        System.out.println("Корабль " + ship.getNumberShip() + " разгружен и отбыл.");
                    } else {
                        System.out.println("В виду отсутствия / переполнения груза в порту корабль "
                                + ship.getNumberShip() + " отбыл с остатком груза " + ship.getCurrentQuantityCargo());
                    }

                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
