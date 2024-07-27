package Task9;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius, String fillColor, String strokeColor, double strokeThickness) {
        super(fillColor, strokeColor, strokeThickness);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double diameter() {
        return 2 * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
