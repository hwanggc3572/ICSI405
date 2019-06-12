package edu.albany.cruise;

public class CruiseShip extends Ship {
	
	private int maxPassenger; // maximum number of passengers
	
	public CruiseShip(String n, String y, int mp) { // constructor
		super(n, y);
		maxPassenger = mp;
	}

	// getter and setter
	public int getMaxPassenger() {
		return maxPassenger;
	}
	
	public void setMaxPassenger(int m) {
		maxPassenger = m;
	}
	
	// override toString
	public String toString() {
		return "The ship " + getName() + "'s maximum number of passengers is " + maxPassenger;
	}
}
