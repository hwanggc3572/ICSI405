package edu.albany.hw2.car;

public class CarTest {

	public static void main(String[] args) {
		FuelGauge fg = new FuelGauge();
		Odometer om = new Odometer();
		
		om.setCurrentMileage(999900);
		fg.setCurrentFuel(15); // fill the car up with fuel
		
		while(fg.getCurrentFuel() != 0) { // run a loop until the car runs out of fuel
			om.increment();
			om.decrementFuel(fg);
			System.out.println("Current Mileage: " + om.getCurrentMileage() + "mile(s)");
			System.out.println("Current Fuel: " + fg.getCurrentFuel() + "gallon(s)");
		}

	}

}
