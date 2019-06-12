package edu.albany.cruise;

public class CargoShip extends Ship {

	private int capacity; // cargo capacity in tonnage
	
	public CargoShip(String n, String y, int c) { // constructor
		super(n, y);
		capacity = c;
	}

	// getter and setter
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int c) {
		capacity = c;
	}
	
	// override toString
	public String toString() {
		return "The ship " + getName() + "'s cargo capacity in tonnage is " + capacity;
	}
}
