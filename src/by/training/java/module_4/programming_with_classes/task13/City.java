package by.training.java.module_4.programming_with_classes.task13;

public class City {

    private String cityName;
    private String capital;

    public City(String name) {
        this.cityName = name;
    }

    public String getCity() {
        return this.cityName;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}