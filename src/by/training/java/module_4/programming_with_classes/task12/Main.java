package by.training.java.module_4.programming_with_classes.task12;

public class Main {

    public static void main(String[] args) {

        // Создать обьект класса Автомобиль, используя классы Колесо, Двигатель.
        // Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

        Car car = new Car();

        car.addCar(
                new Car("Renault", 30, "V8", "Summer"),
                new Car("Peugeot", 50, "V8", "Summer"),
                new Car("Hyundai", 40, "V16", "Summer"));

        System.out.println("Заданные автомобили:");
        car.showInfoCar();
        car.driveCar(car.getCarList());      // ехать (запас хода)

        Wheel wheel = new Wheel();
        wheel.setSeasonalityOfWheels("Winter");
        car.getOneCarList(1).changeWheel(wheel.getSeasonalityOfWheels());  // поменять колеса
        car.getOneCarList(2).refuel(10);         // заправиться

        car.showInfoCar();
        car.driveCar(car.getCarList());      // ехать (запас хода)
    }
}