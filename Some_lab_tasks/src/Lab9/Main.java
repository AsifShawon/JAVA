package Lab9;

public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle(5,"Red",true);
		Rectangle rec1 = new Rectangle(20,10,"Green",true);
		
		circle1.printCircle();
		System.out.println("Area of the Reectangle: "+rec1.getArea());
		System.out.println("Perimeter of the Reectangle: "+rec1.getPerimeter());
	}
}
