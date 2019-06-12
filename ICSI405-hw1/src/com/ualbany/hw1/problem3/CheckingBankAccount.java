package com.ualbany.hw1.problem3;

public class CheckingBankAccount {
	
	private int value; // account value
	
	public void setValue(int num) {
		value = num;
	}
	
	public int getValue() {
		return value;
	}
	
	public void deposit(int money) // when deposit, add money
	{
		value += money;
	}
	
	public void withdraw(int money) // when withdraw, subtract money
	{
		value -= money;
	}
	
}
