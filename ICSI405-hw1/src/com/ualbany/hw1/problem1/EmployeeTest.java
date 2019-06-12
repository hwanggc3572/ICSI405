package com.ualbany.hw1.problem1;

public class EmployeeTest {
	
	public static void main(String[] args)
	{
		// make two employee instances
		Employee employee1 = new Employee("Justin", "Bieber", 4000);
		Employee employee2 = new Employee("Adam", "Levine", 5000);
		
		System.out.println(employee1.getFirstName() + employee1.getLastName() + "'s yearly salary is $" + employee1.getMonthlySalary()*12);
		System.out.println(employee2.getFirstName() + employee2.getLastName() + "'s yearly salary is $" + employee2.getMonthlySalary()*12);
		
		// change their salaries
		employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.1);
		employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);
		
		System.out.println("A year later, " + employee1.getFirstName() + employee1.getLastName() + "'s yearly salary is $" + employee1.getMonthlySalary()*12);
		System.out.println("A year later, " + employee2.getFirstName() + employee2.getLastName() + "'s yearly salary is $" + employee2.getMonthlySalary()*12);
	}
}