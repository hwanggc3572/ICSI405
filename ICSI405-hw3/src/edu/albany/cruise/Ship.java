package edu.albany.cruise;

public class Ship {
	private String name; // ship name
	private String year; // ship built year
	
	public Ship(String n, String y) { // constructor
		name = n;
		year = y;
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setYear(String y) {
		year = y;
	}
	
	public String toString() {
		return "The ship " + name + " was built in " + year;
	}
}
