package Task9;

public class Rectangle extends Shapes {
    private double width;
    private double height;

    public Rectangle(double width, double height, String fillColor, String strokeColor, double strokeThickness) {
        super(fillColor, strokeColor, strokeThickness);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
