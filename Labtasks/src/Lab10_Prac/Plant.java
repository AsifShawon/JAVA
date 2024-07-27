package Lab10_Prac;

public class Plant {
	private String name, color;
	
	public Plant(String name, String color) {
		this.setName(name);
		this.setColor(color);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return name + " " + color;
	}

}
