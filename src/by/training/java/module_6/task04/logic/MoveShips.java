package by.training.java.module_6.task04.logic;

import by.training.java.module_6.task04.content.Ship;

public class MoveShips extends Thread {

    @Override
    public void run() {
        int numberShip = 1;                      // номер корабля

        while (true) {

            Ship ship = new Ship();              // Создание объекта ship
            ship.setNumberShip(numberShip);

            try {
                if (Port.queue.size() == 10) {   // Информирование о заполнении очереди

                    System.out.println("\n" + "Слишком много кораблей, порт приостановил прием" + "\n");
                    Thread.sleep(10000);

                } else {

                    Port.queue.put(ship);       // Добавление корабля в очередь

                    System.out.println("Корабль " + ship.getNumberShip() + " прибыл в порт"
                            + ", имеет " + ship.getCurrentQuantityCargo() + " груза из " + ship.getCarryingCapacity() + " возможных");

                    System.out.println("Ждут свободного дока " + Port.queue.size()
                            + " кораблей, в порту " + Port.currentQuantityCargo + " груза из " + Port.capacity + " возможных." + "\n");

                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        System.out.println(e.toString());
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            numberShip++;
        }
    }
}