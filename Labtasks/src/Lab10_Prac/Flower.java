package Lab10_Prac;

public class Flower extends Plant{
	private boolean hasSmell, hasThorn;
	
	public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
		super(name,color);
		this.setHasSmell(hasSmell);
		this.setHasThorn(hasThorn);
	}

	public boolean isHasSmell() {
		return hasSmell;
	}

	public void setHasSmell(boolean hasSmell) {
		this.hasSmell = hasSmell;
	}

	public boolean isHasThorn() {
		return hasThorn;
	}

	public void setHasThorn(boolean hasThorn) {
		this.hasThorn = hasThorn;
	}
	
	public String toString() {
		return super.toString() + " Smell: " +hasSmell+" Thron: "+hasThorn; 
	}

}