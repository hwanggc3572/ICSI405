package edu.albany.hw2.car;

public class FuelGauge { // class for fuel guage
	private int currentFuel; // gallons of fuel
	
	public int getCurrentFuel() { // getter for current fuel
		return currentFuel;
	}
	
	public void setCurrentFuel(int n) { // setter for current fuel
		currentFuel = n;
	}
	
	public void increment() { // increment fuel by 1 gallon if current fuel is less than 15 gallons
		if(currentFuel < 15) {
			currentFuel++;
		}
	}
	
	public void decrement() { // decrement fuel by 1 gallon if current fuel is more than 0 gallons
		if(currentFuel > 0) {
			currentFuel--;
		}
	}
}
