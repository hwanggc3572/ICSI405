package edu.albany.hw2.stock;

enum Symbol { // Symbol enum
	MSFT("Microsoft"),
	Apl("Apple"),
	GGL("Google"),
	Amz("Amazon"),
	ATT("AT&T");
	
	Symbol (String companyName)
	{
		
	}
	
}

public class Stock {
	private Symbol symbol; // stock's symbol
	private String name; // stock's name
	private double previousClosingPrice; // price for previous day
	private double currentPrice; // price for current time
	
	public Stock(Symbol s, String n) { // constructor with specified symbol and name
		symbol = s;
		name = n;
	}
	
	// accessor functions
	public Symbol getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
	
	// mutator functions
	public void setPreviousClosingPrice(double d) {
		previousClosingPrice = d;
	}
	
	public void setCurrentPrice(double d) {
		currentPrice = d;
	}
}
