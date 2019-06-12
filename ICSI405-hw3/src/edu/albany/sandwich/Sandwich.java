package edu.albany.sandwich;

public class Sandwich {
	private String name; // name and price of sandwich
	private double price;
	
	public Sandwich(String n, double p) { // constructor
		name = n;
		price = p;
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
