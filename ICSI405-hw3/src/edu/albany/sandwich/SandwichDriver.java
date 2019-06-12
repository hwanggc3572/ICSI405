package edu.albany.sandwich;

public class SandwichDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cashier cashier1 = new Cashier("John"); // two cashiers
		Cashier cashier2 = new Cashier("Amy");
		
		Customer customer1 = new Customer("Sara"); // three customers
		Customer customer2 = new Customer("Mark");
		Customer customer3 = new Customer("Dave");
		
		SandwichMaker sm1 = new SandwichMaker("Josh"); // two sandwich makers
		SandwichMaker sm2 = new SandwichMaker("Paul");
		
		Sandwich ham = new Sandwich("Ham Sandwich", 6.00); // three types of sandwiches
		Sandwich salmon = new Sandwich("Salmon Sandwich", 8.00);
		Sandwich veg = new Sandwich("Vegetable Sandwich", 5.00);
		
		Order order1 = cashier1.orderToSandwichMaker(customer1, sm1, ham, 2, 70); // customer1 paid $70, ordered 2 ham
		Order order2 = cashier2.orderToSandwichMaker(customer2,sm2,salmon, 3, 30); // customer2 paid $30, ordered 3 salmon
		Order order3 = cashier1.orderToSandwichMaker(customer3,sm1,veg, 1, 50); // customer3 paid $50, ordered 1 veg
		
		// print order information
		System.out.println("\nOrder information");
		System.out.println(order1);
		System.out.println(order2);
		System.out.println(order3);
		
	}

}
