package by.training.java.module_4.programming_with_classes.task12;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private int fuel;
    private String engine;
    private String wheel;
    private List<Car> carList;
    // модель, топливо, двигатель, колесо

    public Car() {
        this.carList = new ArrayList<>();
    }

    public Car(String model, int fuel, String engine, String wheel) {
        this.model = model;
        this.fuel = fuel;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void addCar(Car... car) {
        for (int i = 0; i < car.length; i++) {
            carList.add(car[i]);
        }
    }

    public String getModel() {
        return model;
    }

    public int getFuel() {
        return fuel;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheel() {
        return wheel;
    }

    public Car getOneCarList(int index) {
        return carList.get(index);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void changeWheel(String wheel) {
        this.wheel = wheel;
    }

    public void refuel(int fuel) {
        this.fuel += fuel;
    }

    public void driveCar(List<Car> cars) {
        Engine engine = new Engine();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Запас хода авто " + cars.get(i).getModel() + " = "
                    + engine.getDistanceTraveled(cars.get(i).getFuel()) + " км");
        }
        System.out.println("");
    }

    public String getCar() {
        return "Модель: " + getModel() + ", остаток топлива: " + getFuel() + ", тип двигателя: " + getEngine()
                + ", сезонность колес: " + getWheel();
    }

    public String getInfoCar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < carList.size(); i++) {
            sb.append(carList.get(i).getCar());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void showInfoCar() {
        System.out.println(getInfoCar());
    }
}