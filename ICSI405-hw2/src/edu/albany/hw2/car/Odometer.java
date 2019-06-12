package edu.albany.hw2.car;

public class Odometer {
	private int currentMileage; // current mileage
	private int count = 0; // count the mileage increment
	
	public int getCurrentMileage() { // getter for current mileage
		return currentMileage;
	}
	
	public void setCurrentMileage(int n) { // setter for current mileage
		currentMileage = n;
	}
	
	public void increment() { // if current mileage is less than 999,999 miles, add 1. Otherwise, current mileage becomes zero.
		if(currentMileage < 999999) {
			currentMileage++;
			count++;
		} else {
			currentMileage = 0;
		}
	}
	
	// to work with fuel gauge
	public void decrementFuel(FuelGauge fg) { // every 22 miles, decrement fuel by 1 gallon
		if(count == 22) {
			fg.decrement();
			count = 0;
		}
	}
}
