package problem;

import java.util.BitSet;

public class BinaryWord implements Complementable<BinaryWord> {
	// fields
	private BitSet bs;
	private int bsLength;
	
	// constructor
	public BinaryWord(String bin) {
		bs = new BitSet(bin.length());
		bsLength = bin.length();
		
		for(int i=0; i<bsLength; i++) {
			if (bin.charAt(i) == '1') {
				bs.set(i);
			}
		}
		
	}
	
	// get complement of the binary word
	@Override
	public BinaryWord complement() {
		String s = "";
		
		// opposite way to print binary word
		for(int i=0; i<bsLength; i++) {
			if(bs.get(i)) {
				s += '0';
			} else {
				s += '1';
			}
		}
		BinaryWord complement = new BinaryWord(s);
		return complement;
	}
	
	// equals method
	public boolean equals(BitSet s) {
		if(s.equals(bs)) {
			return true;
		} else {
			return false;
		}
	}
	
	// toString method
	public String toString() {
		String bin = "";
		for(int i=0; i<bsLength; i++) {
			if(bs.get(i)) {
				bin += '1';
			} else {
				bin += '0';
			}
		}
		return bin;
	}

}
