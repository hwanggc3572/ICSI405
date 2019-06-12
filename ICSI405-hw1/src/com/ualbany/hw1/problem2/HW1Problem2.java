package com.ualbany.hw1.problem2;

import java.lang.Math; // to use sqrt function
import java.util.Random; // to make random numbers

public class HW1Problem2 {

	// if x is divided by y, return true. Otherwise false
	public boolean multiple(int x, int y)
	{
		if (x%y == 0)
		{
			return true;
		} else {
			return false;
		}
	}
	
	// I wanted to make remainder method, not reminder, but HW1 description said write a method called reminder
	// return remainder of x / 7
	public int reminder(int x)
	{
		return x%7;
	}
	
	// return distance of two points
	public double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	
	// flip a coin ten times
	public void flipCoin()
	{
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) // repeat 10 times
		{
			
			// obtain a number 0 ~ 100
			int n = random.nextInt(100);
			
			if((n%2) == 0) // if the remainder of random number / 2 is 0, it's a head
			{
				System.out.print("Head\n");
			} else {
				System.out.print("Tail\n");
			}
		}
	}
	
}
