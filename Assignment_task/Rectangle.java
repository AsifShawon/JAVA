package Assignment2;

public class Rectangle extends GeometricObject implements ExceptionInterface {
    private double width;
    private double height;

    public Rectangle() {
        
    }

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Height/Width cannot be negative.");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Height/Width cannot be negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height/Width cannot be negative.");
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}