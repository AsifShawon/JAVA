package Question_4;

public class Triangle implements GeoObj {
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
    	double s = perimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
