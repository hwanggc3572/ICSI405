package edu.albany.sandwich;

public class SandwichMaker {
	private String name; // name of sandwich maker
	
	public SandwichMaker(String n) { // constructor
		name = n;
	}
	
	public String getName() { // getter
		return name;
	}
	
	// when someone orders, cashier lets sandwich maker know the type of sandwich and quantity.
	// so sandwich maker can make sandwich
	public void makeSandwich(Sandwich sandwich, int quantity) {
		System.out.println(this.getName() + " makes " + quantity + " of " + sandwich.getName());
	}
	
}
