package Abstract_basic;

public abstract class Animal {
	private String name, type;
	
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	// abstract method
	abstract public void Sound();
}
