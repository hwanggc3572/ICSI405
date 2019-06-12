package edu.albany.cruise;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ship[] sa = new Ship[5]; // Ship Array
		sa[0] = new Ship("Ship-red", "1995");
		sa[1] = new CruiseShip("Ship-blue", "1997", 500);
		sa[2] = new CargoShip("Ship-orange", "1990", 4000);
		sa[3] = new Ship("Ship-yellow", "2000");
		sa[4] = new CargoShip("Ship-black", "2005", 3000);
		
		for(Ship s : sa) { // print ship array elements
			System.out.println(s);
		}

	}

}
