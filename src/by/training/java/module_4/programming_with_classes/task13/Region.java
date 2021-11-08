package by.training.java.module_4.programming_with_classes.task13;

import java.util.ArrayList;

public class Region {

    private double countryArea;
    private City city;
    private ArrayList<District> districtList = new ArrayList<>();

    public Region(District district, City city, double countryArea) {
        this.setDistrictList(district);
        this.setCity(city);
        this.setCountryArea(countryArea);
    }

    public void setDistrictList(District district) {
        this.districtList.add(district);
    }

    public String getCity() {
        return city.getCity();
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea += countryArea;
    }
}