package Lab12_prac;

public abstract class Polygon {
	
	private int numSide;
	
	public Polygon(int n) {
		numSide = n;
	}

	public int getNumSide() {
		return numSide;
	}

	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}
	
	public abstract double area();
	public abstract double perimeter();
}
