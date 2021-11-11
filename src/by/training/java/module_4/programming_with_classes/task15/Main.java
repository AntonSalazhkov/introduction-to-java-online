package by.training.java.module_4.programming_with_classes.task15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
        //различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
        //возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

        TravelTour travelTour = new TravelTour();
        travelTour.addTravelTour
                (new TravelTour(TourType.REST, TouristTransport.CAR, TouristFood.DINNER, 21),
                        new TravelTour(TourType.EXCURSIONS, TouristTransport.TRAIN, TouristFood.LUNCH, 5),
                        new TravelTour(TourType.TREATMENT, TouristTransport.TRAIN, TouristFood.BREAKFAST, 10),
                        new TravelTour(TourType.SHOPPING, TouristTransport.AIRPLANE, TouristFood.ALL_INCLUSIVE, 5),
                        new TravelTour(TourType.CRUISE, TouristTransport.NONE, TouristFood.NONE, 3),
                        new TravelTour(TourType.REST, TouristTransport.CAR, TouristFood.DINNER, 5));

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("Текущий список туров:");
        travelTour.getTravelTourList();

        // Путевки сортируются по дням на момент вывода списка (4), после установки параметра можно вывести
        // уточненный список либо прордолжить устанавливать параметры

        do {
            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Выбрать предпочитаемый вид транспорта"
                    + "\n2. Выбрать включенное питание"
                    + "\n3. Выбрать желаемое количество дней"
                    + "\n4. Вывести подходящий под выбор список туров"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    System.out.print("Выберите предпочитаемый вид транспорта (car, train, airplane, none) >> ");
                    while (!travelTour.getUserChoice(sc.nextLine(), 1)) {
                        System.out.println("Некорректный ввод");
                        System.out.print("Повторите ввод >> ");
                    }
                    travelTour.processTheTourList(1);
                    break;
                case "2":
                    System.out.print("Выберите включенное питание (breakfast, lunch, dinner, all_inclusive, none) >> ");
                    while (!travelTour.getUserChoice(sc.nextLine(), 2)) {
                        System.out.println("Некорректный ввод");
                        System.out.print("Повторите ввод >> ");
                    }
                    travelTour.processTheTourList(2);
                    break;
                case "3":
                    System.out.print("Выберите желаемое количество дней (3, 5, 10, 21) >> ");
                    while (!travelTour.getUserChoice(sc.nextLine(), 3)) {
                        System.out.println("Некорректный ввод");
                        System.out.print("Повторите ввод >> ");
                    }
                    travelTour.processTheTourList(3);
                    break;
                case "4":
                    System.out.println("Подходящий под выбор список туров:");
                    travelTour.getSelectedTravelTourList();
                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }
}