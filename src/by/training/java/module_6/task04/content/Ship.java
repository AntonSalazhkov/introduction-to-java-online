package by.training.java.module_6.task04.content;

import java.util.Random;

public class Ship {

    int numberShip = 0;
    int currentQuantityCargo;        // текущее количество груза
    int carryingCapacity;            // грузоподъемность

    public Ship() {
        Random rnd = new Random();

        setCarryingCapacity(10 + rnd.nextInt(20));            // мин. грузоподъемность 10, макс. = 50
        setCurrentQuantityCargo(rnd.nextInt(getCarryingCapacity())); // устанавливаем количество груза по умолчанию
    }

    public int getNumberShip() {
        return numberShip;
    }

    public void setNumberShip(int numberShip) {
        this.numberShip = numberShip;
    }


    public int getCurrentQuantityCargo() {
        return currentQuantityCargo;
    }

    public void setCurrentQuantityCargo(int currentQuantityCargo) {
        this.currentQuantityCargo = currentQuantityCargo;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
