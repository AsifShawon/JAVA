package Assignment2;

import java.util.Scanner;

interface GeoObj {
	final double pi = 3.1416;
    double area();
    double perimeter();
}

class Triangle implements GeoObj {
    private double side1, side2, side3;

    public Triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Circle implements GeoObj {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sides of the triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("Triangle's\n Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
        System.out.println("Circle's\n Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
    }
}

