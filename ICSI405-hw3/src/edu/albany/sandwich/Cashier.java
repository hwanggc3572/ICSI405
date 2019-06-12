package edu.albany.sandwich;

public class Cashier {
	private String name; // name of cashier
	
	public Cashier(String n) { // constructor
		name = n;
	}
	
	public String getName() { // getter
		return name;
	}
	
	// order to sandwich maker
	public Order orderToSandwichMaker(Customer c, SandwichMaker sm, Sandwich s, int quantity, double paying) {
		Order order = new Order(this, c, sm, s, quantity, paying);
		System.out.println(c.getName() + " pays $" + paying); // print the amount customer paid
		sm.makeSandwich(s, quantity); // sandwich maker makes that quantity of sandwich
		return order;
	}
	
	
}
