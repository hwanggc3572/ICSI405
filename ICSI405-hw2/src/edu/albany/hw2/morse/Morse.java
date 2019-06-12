package edu.albany.hw2.morse;

public class Morse {
	private char[] letters = {' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', 
			'9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // char array that matches the user input
	private String[] morse = { // morse code that matches letters 
				" ", // space
				"--..--", // comma
				".-.-.-", // period
				"..--..", // question mark
				"-----", // 0
				".----", // 1
				"..---", // 2
				"...--", // 3
				"....-", // 4
				".....", // 5
				"-....", // 6
				"--...", // 7
				"---..", // 8
				"----.", // 9
				".-", // A
				"-...", // B
				"-.-.", // C
				"-..", // D
				".", // E
				"..-.", // F
				"--.", // G
				"....", // H
				"..", // I
				".---", // J
				"-.-", // K
				".-..", // L
				"--", // M
				"-.", // N
				"---", // O
				".--.", // P
				"--.-", // Q
				".-.", // R
				"...", // S
				"-", // T
				"..-", // U
				"...-", // V
				".--", // W
				"-..-", // X
				"-.--", // Y
				"--.." // Z
		};
	
	public Morse() { // Morse constructor
		
	}
	
	
	public StringBuffer encode(StringBuffer sb) {
		StringBuffer newsb = new StringBuffer();
		for(int i=0; i<sb.length(); i++) { 
			for(int j=0; j<letters.length; j++) {
				if(sb.charAt(i) == letters[j]) { // if input's i-th letter is same as j-th letter of letters array
					newsb.append(morse[j]); // append j-th morse code to output
				}
			}
		}
		
		return newsb;
	}
	
	// Strategy and reason
	/*
	 * I used two arrays, the one is char array and the other is string array
	 * And both arrays match each other's morse code and letter
	 * so when the input's letter is same as table's letter at the index
	 * add morse code at the index to the output string buffer
	 * I used this strategy because I don't need to make more methods to translate letters to morse codes
	 * By using nested loop, I can generate morse code easily.
	 */
	
}
