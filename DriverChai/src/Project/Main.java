package Project;

public class Main implements runable{
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	@Override
	public void run() {
		new Menu();
	}
}
