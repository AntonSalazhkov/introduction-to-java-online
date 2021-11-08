package by.training.java.module_4.programming_with_classes.task13;

public class Main {

    public static void main(String[] args) {

        // Создать объект класса Государство, используя классы Область, Район, Город.
        // Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

        Country country = new Country("Belarus");
        System.out.println("Страна: " + country.getCountryName());
        City city = new City(null);
        city.setCapital("Minsk");
        System.out.println("Столица: " + city.getCapital());

        country.addRegion(new Region(new District("Brestkaya oblast"), new City("Brest"), 32786));
        country.addRegion(new Region(new District("Grondnenskaya oblast"), new City("Grodno"), 25127));
        country.addRegion(new Region(new District("Minskaya oblast"), new City("Minsk"), 39854));
        country.addRegion(new Region(new District("Gomelskaya oblast"), new City("Gomel"), 40372));
        country.addRegion(new Region(new District("Vitebskaya oblast"), new City("Vitebsk"), 40051));
        country.addRegion(new Region(new District("Mogilevskaya oblast"), new City("Mogilev"), 29068));

        System.out.println("Количество областей: " + country.getRegionList().size());

        System.out.println("Площадь страны: " + country.getCountryArea() + " км" + (char)178);

        System.out.println("Областные центры:");
        country.getString();
    }
}