package Question_4;

public class Main {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter sides of triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        scanner.close();
    }
}
