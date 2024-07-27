package Lab12_prac;

public class Triangle extends Polygon{
	
	private double a,b,c;
	
	public Triangle(int n, double a, double b, double c) {
		super(n);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public double perimeter() {
		return a+b+c;
	}
	
	@Override
	public double area() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
