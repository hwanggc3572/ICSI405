package edu.albany.sandwich;

public class Order {
	private Cashier cashier; // order needs all these fields
	private Customer customer;
	private SandwichMaker sm;
	private Sandwich sandwich;
	private int quantity;
	private double received;
	
	public Order(Cashier cash, Customer cust, SandwichMaker smaker, Sandwich sw, int q, double r) { // constructor
		cashier = cash;
		customer = cust;
		sm = smaker;
		sandwich = sw;
		quantity = q;
		received = r;
	}
	
	// getters
	public Sandwich getSandwich() {
		return sandwich;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getChange() {
		received = received - (quantity * sandwich.getPrice()); // to calculate the change amount
		return received;
	}
	
	// to print order history
	public String toString() {
		return "Cashier " + cashier.getName() + " took an order from customer " + customer.getName() + 
				"\n: " + quantity + " of " + sandwich.getName() + "\n: the total price is $" + quantity*sandwich.getPrice()
				+ "\n: received money $" + received + "\n: change amount $" + this.getChange();
	}
}
