package com.ualbany.hw1.problem3;

// address class
public class Address {
	private String line1;
	private String line2;
	private String city;
	private String State;
	private String zip;
	
	public void setLine1(String str) {
		line1 = str;
	}
	public void setLine2(String str) {
		line2 = str;
	}
	public void setCity(String str) {
		city = str;
	}
	public void setState(String str) {
		State = str;
	}
	public void setZip(String str) {
		zip = str;
	}
	
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return State;
	}
	public String getZip() {
		return zip;
	}
}
