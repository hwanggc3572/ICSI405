package edu.albany.hw2.stock;

public class StockTest {

	public static void main(String[] args) {
		Stock microsoft = new Stock(Symbol.MSFT, "Microsoft"); // Microsoft Stock
		microsoft.setPreviousClosingPrice(58.9);
		microsoft.setCurrentPrice(59);
		System.out.println("Microsoft change percentage is " + microsoft.getChangePercent() + "%");
		
		Stock google = new Stock(Symbol.GGL, "Google"); // Google Stock
		google.setPreviousClosingPrice(135.1);
		google.setCurrentPrice(157.6);
		System.out.println("Google change percentage is " + google.getChangePercent() + "%");
	}

}
