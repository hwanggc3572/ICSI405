package com.ualbany.hw1.problem2;

import java.util.Scanner;

public class Problem2Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HW1Problem2 hp = new HW1Problem2();
		
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(hp.multiple(num1, num2))
		{
			System.out.println("Remainder of " + num1 + "/" + num2 + " = 0");
		} else {
			System.out.println("Remainder of " + num1 + "/" + num2 + " is not 0");
		}
		
		System.out.println("Enter a number: ");
		int num3 = sc.nextInt();
		System.out.println(num3 + "%7 = " + hp.reminder(num3));
		
		System.out.println("Enter two points(x,y): \n");
		System.out.println("x1: ");
		double x1 = sc.nextDouble();
		System.out.println("y1: ");
		double y1 = sc.nextDouble();
		System.out.println("x2: ");
		double x2 = sc.nextDouble();
		System.out.println("y2: ");
		double y2 = sc.nextDouble();
		System.out.println("The distance between two points is: " + hp.distance(x1, y1, x2, y2));
		
		System.out.println("The result of flipping a coin 10 times: \n");
		hp.flipCoin();
		
		
	}

}
