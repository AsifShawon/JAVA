package Class_bassic;


/*
Write a program to print the area and perimeter of a circle having radius of 5 units by 
creating a class named 'Circle' without any parameter in its constructor. Give another
attribute named “color” then print the value of color in the console.
 */

public class Circle {
	double radius;
	String color;
	
	public Circle() {
		radius = 5;
		color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double perimeter() {
		return 2*3.1416*radius;
	}
	
	public double area() {
		return 3.1416*radius*radius;
	}
}
