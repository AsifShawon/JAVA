package Assignment2;

public class task5 {
	public static void main(String[] args) {
		// object 1
		GeometricObject rec1 = new Rectangle(5,8);
		System.out.println("Rectangle 1: ");
		System.out.println("Perimeter: "+rec1.getPerimeter());
		System.out.println("Area: "+rec1.getArea());
		
		// object 2
		GeometricObject rec2 = new Rectangle(-5,8);
		System.out.println("Rectangle 2: ");
		System.out.println("Perimeter: "+rec2.getPerimeter());
		System.out.println("Area: "+rec2.getArea());
	}
}
