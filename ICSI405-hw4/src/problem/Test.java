package problem;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		
		
		// BinaryWord test
		String s1 = "101100110";
		String s2 = "010011001";
		
		BinaryWord bw = new BinaryWord(s1);
		BinaryWord bw2 = new BinaryWord(s2);
		
		System.out.println("The first binary word is " + bw);
		System.out.println("The second binary word is " + bw2);
		
		if(bw.equals(bw2)) { // equals test
			System.out.println(bw + " is " + bw2);
		} else {
			System.out.println(bw + " is not " + bw2);
		};
		
		System.out.println("The complement of " + bw + " is: " + bw.complement() + "\n"); // complement test
		
		
		
		// PositiveInteger test
		PositiveInteger integer1 = new PositiveInteger(10);
		PositiveInteger integer2 = new PositiveInteger(20);
		
		System.out.println("The first integer value is " + integer1);
		System.out.println("The second integeer value is " + integer2);
		
		PositiveInteger sum = (PositiveInteger) integer1.operator(integer2); // operator test
		System.out.println("The sum of two values is " + sum); // toString test
		
		if(integer1.equals(integer2)) { // equals test
			System.out.println(integer1 + " is " + integer2 + "\n");
		} else {
			System.out.println(integer1 + " and " + integer2 + " are different\n");
		}
		
		
		
		// RGBColor test
		RGBColor color1 = new RGBColor(200, 100, 15);
		RGBColor color2 = new RGBColor(100, 130, 120);
		
		System.out.println("The first color is " + color1);
		System.out.println("The second color is " + color2);
		
		if(color1.equals(color2)) { // equals test
			System.out.println(color1 + " and " + color2 + " are same colors");
		} else {
			System.out.println(color1 + " is not " + color2);
		}
		
		RGBColor mix = (RGBColor) color1.operator(color2); // operator test
		System.out.println("The blending color is " + mix);
		
		RGBColor comp = (RGBColor) color1.complement(); // complement test
		System.out.println("The complement color of " + color1 + " is " + comp + "\n");
		
		
		
		// Semigroup Combine test
		Collection<PositiveInteger> numbers = new ArrayList<PositiveInteger>(); // combine test for positive integers
		numbers.add(new PositiveInteger(10));
		numbers.add(new PositiveInteger(20));
		numbers.add(new PositiveInteger(30));
		numbers.add(new PositiveInteger(40));
		PositiveInteger sumOfIntegers = (PositiveInteger) Semigroup.combine(numbers);
		System.out.println("The sum of numbers is " + sumOfIntegers);
		
		Collection<RGBColor> colors = new ArrayList<RGBColor>(); // combine test for RGB Colors
		colors.add(new RGBColor(100, 200, 50));
		colors.add(new RGBColor(20, 30, 60));
		RGBColor blending = (RGBColor) Semigroup.combine(colors);
		System.out.println("The blending color is " + blending);
	}	

}
