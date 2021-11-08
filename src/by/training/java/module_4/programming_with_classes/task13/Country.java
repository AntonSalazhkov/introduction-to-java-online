package by.training.java.module_4.programming_with_classes.task13;

import java.util.ArrayList;

public class Country {

    private String countryName;
    private int countryArea;
    private ArrayList<Region> regionList = new ArrayList<>();


    public Country(String countryName) {
        this.setCountryName(countryName);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryArea() {
        addCountryArea();
        return countryArea;
    }

    public void addRegion(Region region) {
        this.regionList.add(region);
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void getString() {
        for (int i = 0; i < regionList.size(); i++) {
            System.out.println(regionList.get(i).getCity());
        }
    }

    public void addCountryArea() {
        for (int i = 0; i < regionList.size(); i++) {
            countryArea += regionList.get(i).getCountryArea();
        }
    }
}