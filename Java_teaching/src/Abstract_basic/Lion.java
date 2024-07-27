package Abstract_basic;

public class Lion extends Animal{

	public Lion(String name, String type) {
		super(name, type);
	}

	@Override
	public void Sound() {
		System.out.println("woooo");
	}

}
