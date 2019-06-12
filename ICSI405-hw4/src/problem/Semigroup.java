package problem;

import java.util.Collection;

// abstract class
public abstract class Semigroup<AnyType> {
	// operator operation which takes one argument
	public abstract Semigroup<AnyType> operator(AnyType at);
	
	public static <AnyType> AnyType combine(Collection<AnyType> cols) {
		Semigroup<AnyType> sum = null;
		
		// using enhanced for loop to find sum
		for(AnyType col : cols) {
			if(sum == null) {
				sum = (Semigroup<AnyType>) col;
			} else {
				sum = sum.operator((AnyType) col);
			}
		}
		return (AnyType)sum;
	}
}
