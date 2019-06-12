package com.ualbany.hw1.problem3;

public class Bank {
	
	private static String bankName = "SEFCU";
	private static String bankAddress = "Campus Center";
	
	static Person person = new Person(); // make a person who uses this bank account
	
	public static void printReceipt() // to print receipt information
	{
		System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.add.getLine1() + " " + person.add.getLine2() + ", " + 
		person.add.getCity() + ", " + person.add.getState() + ", " + person.add.getZip() + ", current value: $" + person.cba.getValue());
	}
	
	public static void main(String[] args)
	{
		person.setFirstName("Justin");
		person.setLastName("Bieber");
		person.add.setLine1("6 Niblock ct");
		person.add.setLine2("2nd Floor");
		person.add.setCity("Albany");
		person.add.setState("New York");
		person.add.setZip("12206");
		
		System.out.println(person.getFirstName() + " " + person.getLastName() + " came into the " + bankName + " bank in the " + bankAddress + ".");
		
		person.cba.setValue(1000);
		System.out.println(person.getFirstName() + " " + person.getLastName() + "'s initial value is $" + person.cba.getValue());
		
		person.cba.deposit(1000);
		printReceipt();
		person.cba.withdraw(500);
		printReceipt();
		
	}
}
