package by.training.java.module_5.basics_of_OOP.task04.content;

import by.training.java.module_5.basics_of_OOP.task04.content.precious_metal.Copper;
import by.training.java.module_5.basics_of_OOP.task04.content.precious_metal.Gold;
import by.training.java.module_5.basics_of_OOP.task04.content.precious_metal.Silver;

import java.util.Random;

public class Treasure {

    Random random = new Random();
    private Metal[] metals = {new Copper(), new Silver(), new Gold()};
    private int treasureNumber;      // номер сокровища
    private int quantity;            // количество
    private int price;               // общая стоимость сокровища
    private Metal metal;             // материал монет

    public Treasure(int treasureNumber) {
        this.treasureNumber = treasureNumber;
        setMetal(random.nextInt(metals.length));
        setQuantity(1 + random.nextInt(100));
        setPrice(metal.getPrice());
    }

    public String getMetal() {
        return metal.toString();
    }

    public void setMetal(int numberMetal) {
        this.metal = metals[numberMetal];
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = this.quantity * price;
    }

    public int getTreasureNumber() {
        return treasureNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int amount) {
        this.quantity = amount;
    }

    @Override
    public String toString() {
        return System.getProperty("line.separator") + "Сокровище №: " + getTreasureNumber() + " содержит "
                + getQuantity() + " монет " + getMetal() + ", ценностью: " + getPrice() + " медных монет";
    }
}
