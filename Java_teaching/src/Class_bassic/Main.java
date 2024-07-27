package Class_bassic;

public class Main {
	public static void main(String[] args) {
		Circle c1 = new Circle(6,"green");
		Circle c2 = new Circle();
		
		System.out.println("Perimeter: "+c1.perimeter());
		System.out.println("Area: "+c1.area());
		System.out.println("Color: "+c1.color);
		
		System.out.println("Perimeter: "+c2.perimeter());
		System.out.println("Area: "+c2.area());
		System.out.println("Color: "+c2.color);
	}
}
