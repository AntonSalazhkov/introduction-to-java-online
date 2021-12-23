package by.training.java.module_5.basics_of_OOP.task04.content.precious_metal;

import by.training.java.module_5.basics_of_OOP.task04.content.Metal;

public class Gold implements Metal{
	
	private int price = 10000;

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Gold";
	}
}
