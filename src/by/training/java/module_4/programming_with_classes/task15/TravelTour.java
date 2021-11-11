package by.training.java.module_4.programming_with_classes.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TravelTour {

    private List<TravelTour> travelTourList;
    private List<TravelTour> selectedTravelTourList;
    private TourType tourType;
    private TouristTransport touristTransport;
    private TouristFood touristFood;
    private int day;
    private String selectedTransport = "";
    private String selectedFood = "";
    private String selectedNumberOfDays = "";

    public TravelTour() {
        this.travelTourList = new ArrayList<>();
        this.selectedTravelTourList = new ArrayList<>();
    }

    public TravelTour(TourType tourType, TouristTransport touristTransport, TouristFood touristFood, int day) {
        this.setTourType(tourType);
        this.setTouristTransport(touristTransport);
        this.setTouristFood(touristFood);
        this.setDay(day);
    }

    public TourType getTourType() {
        return this.tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public boolean getUserChoice(String choice, int parameter) {
        boolean correctInput = false;
        for (int i = 0; i < travelTourList.size(); i++) {
            if (choice.compareToIgnoreCase(travelTourList.get(i).getTouristTransport()) == 0 && parameter == 1) {
                this.selectedTransport = choice;
                correctInput = true;
            }
            if (choice.compareToIgnoreCase(travelTourList.get(i).getTouristFood()) == 0 && parameter == 2) {
                this.selectedFood = choice;
                correctInput = true;
            }
            if (choice.compareToIgnoreCase(travelTourList.get(i).getDay()) == 0 && parameter == 3) {
                this.selectedNumberOfDays = choice;
                correctInput = true;
            }
        }
        return correctInput;
    }

    public String getTouristTransport() {
        return "" + touristTransport;
    }

    public void setTouristTransport(TouristTransport touristTransport) {
        this.touristTransport = touristTransport;
    }

    public String getTouristFood() {
        return "" + touristFood;
    }

    public void setTouristFood(TouristFood touristFood) {
        this.touristFood = touristFood;
    }

    public String getDay() {
        return "" + day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void addTravelTour(TravelTour... travelTour) {
        for (int i = 0; i < travelTour.length; i++) {
            this.travelTourList.add(travelTour[i]);
        }
    }

    public void getTravelTourList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < travelTourList.size(); i++) {
            sb.append(travelTourList.get(i).toString());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void getSelectedTravelTourList() {
        // сортируем вывод по возрастанию дней
        Comparator<TravelTour> comparator = (day2, day1) -> (day1.getDay()).compareTo(day2.getDay());
        Collections.sort(travelTourList, comparator);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < travelTourList.size(); i++) {
            sb.append(travelTourList.get(i).toString());
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    public void processTheTourList(int parameter) {
        for (int i = 0; i < travelTourList.size(); i++) {
            if (parameter == 1 && selectedTransport.compareToIgnoreCase(travelTourList.get(i).getTouristTransport()) == 0) {
                selectedTravelTourList.add(travelTourList.get(i));
            }
            if (parameter == 2 && selectedFood.compareToIgnoreCase(travelTourList.get(i).getTouristFood()) == 0) {
                selectedTravelTourList.add(travelTourList.get(i));
            }
            if (parameter == 3 && selectedNumberOfDays.compareToIgnoreCase(travelTourList.get(i).getDay()) == 0) {
                selectedTravelTourList.add(travelTourList.get(i));
            }
        }
        travelTourList = selectedTravelTourList;
        this.selectedTravelTourList = new ArrayList<>();
    }

    public String toString() {
        return "Тип путевки: " + getTourType() + ", транспорт: " + getTouristTransport() + ", питание: "
                + getTouristFood() + ", количество дней: " + getDay();
    }
}