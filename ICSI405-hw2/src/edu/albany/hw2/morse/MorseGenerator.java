package edu.albany.hw2.morse;

import java.util.Scanner;

public class MorseGenerator {

	public static void main(String[] args) {
		
		Morse morse = new Morse();
		Scanner keyboard = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		if(args.length >= 1) { // get input from the command line
			for(int i=0; i<args.length; i++) {
				sb.append(args[i].toUpperCase()); // not case sensitive
			}
		} else { // get input from the user
			System.out.println("Enter the input: ");
			String input = keyboard.nextLine();
			sb.append(input.toUpperCase()); // not case sensitive
		}
		
		System.out.println(morse.encode(sb)); // generate morse code
		
		// I wrote the strategy and reason in Morse.java
	}

}
