package Assignment2;

import java.util.Date;

public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		return "Color: "+color + " \nFilled: " + filled + " \nDate Created: " + dateCreated;
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimeter() {
		return 0;
	}
}
