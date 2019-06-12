package problem;

public class PositiveInteger extends Semigroup<PositiveInteger> {
	// field
	private int pi;
	
	// constructor
	public PositiveInteger(int value) {
		pi = value;
	}
	
	// operator: return sum of two values
	@Override
	public Semigroup<PositiveInteger> operator(PositiveInteger at) {
		PositiveInteger sum = new PositiveInteger(pi + at.pi);
		// TODO Auto-generated method stub
		return sum;
	}
	
	// equal method: check two integers if they have same values
	public boolean equals(PositiveInteger at) {
		if(pi == at.pi) {
			return true;
		} else {
			return false;
		}
	}
	
	// print integer value
	public String toString() {
		String str = Integer.toString(pi);
		return str;
	}

}
