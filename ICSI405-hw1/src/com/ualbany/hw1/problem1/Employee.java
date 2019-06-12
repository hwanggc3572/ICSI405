package com.ualbany.hw1.problem1;

public class Employee {
	// each employee has name and salary
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee (String fn, String ln, double ms)
	{
		firstName = fn;
		lastName = ln;
		monthlySalary = ms;
	}
	
	// getters and setters for each method
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String ln)
	{
		lastName = ln;
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	public void setMonthlySalary(double ms)
	{
		if(ms < 0) // if monthlySalary is less than zero, set monthlySalary zero
		{
			monthlySalary = 0.0;
		} else {
			monthlySalary = ms;
		}
	}
}
