package com.ualbany.hw1.problem3;

// person class
public class Person { // each person has a name, bank account and address
	private String firstName;
	private String lastName;
	
	public void setFirstName(String str) {
		firstName = str;
	}
	public void setLastName(String str) {
		lastName = str;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	CheckingBankAccount cba = new CheckingBankAccount();
	Address add = new Address();
}
