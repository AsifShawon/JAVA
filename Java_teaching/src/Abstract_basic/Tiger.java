package Abstract_basic;

public class Tiger extends Animal{

	public Tiger(String name, String type) {
		super(name, type);
	}

	@Override
	public void Sound() {
		System.out.println("Halum");
	}
}