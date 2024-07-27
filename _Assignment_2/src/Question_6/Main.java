package Question_6;

public class Main {
	public static void main(String[] args) {
		GeometricObject obj1 = new Rectangle(5,5);
		System.out.println("Area of object 1:"+obj1.getArea());
		System.out.println("Perimeter of object 1:"+obj1.getPerimeter());
		GeometricObject obj2 = new Rectangle(-5,5);
		System.out.println("Area of object 2:"+obj2.getArea());
		System.out.println("Perimeter of object 2:"+obj2.getPerimeter());
	}
}
