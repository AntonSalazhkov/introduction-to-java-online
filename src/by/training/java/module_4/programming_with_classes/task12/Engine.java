package by.training.java.module_4.programming_with_classes.task12;

public class Engine {    // двигатель

    private int fuelConsumption = 10;     // расход топлива на 100 км
    private int distanceTraveled;         // запас хода

    public int getDistanceTraveled(int fuel) {
        distanceTraveled = fuel * 100 / this.fuelConsumption;
        return distanceTraveled;
    }
}