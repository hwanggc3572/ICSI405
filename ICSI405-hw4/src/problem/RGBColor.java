package problem;

public class RGBColor extends Semigroup<RGBColor> implements Complementable {
	
	// field
	private int r,g,b;
	
	// constructor
	public RGBColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	// complement of color is 255 - color value
	@SuppressWarnings("unchecked")
	@Override
	public Complementable<RGBColor> complement() {
		int compR = 255-r;
		int compG = 255-g;
		int compB = 255-b;
		
		// TODO Auto-generated method stub
		return new RGBColor(compR, compG, compB);
	}

	// operator: make a blending color (average)
	@Override
	public Semigroup<RGBColor> operator(RGBColor rgb) {
		int avgR = (r + rgb.r)/2;
		int avgG = (g + rgb.g)/2;
		int avgB = (b + rgb.b)/2;
		
		// TODO Auto-generated method stub
		return new RGBColor(avgR, avgG, avgB);
	}
	
	// equals method
	public boolean equals(RGBColor rgb) {
		if((r == rgb.r) && (g == rgb.g) && (b == rgb.b)) {
			return true;
		} else {
			return false;
		}
	}
	
	// print r,g,b values
	public String toString() {
		return "[" + r + ", " + g + ", " + b + "]";
	}

}
