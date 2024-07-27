package Question_6;

public class Rectangle extends GeometricObject implements exceptiopInterface{
	private double width, height;

	public Rectangle() {
		width = height = 0;
	}
	
	public Rectangle(double width, double height) {
		if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Height / Width cannot be negative.");
        }
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double newWidth) throws IllegalArgumentException {
        if (newWidth < 0) {
            throw new IllegalArgumentException("Width cannot be negative.");
        }
        this.width = newWidth;
    }

	public double getHeight() {
		return height;
	}

	public void setHeight(double newHeight) throws IllegalArgumentException {
        if (newHeight < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = newHeight;
    }

	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
