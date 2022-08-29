package Lab13;

public class Task3 {
	public static void main(String[] args) {
		try {
			new Triangle(3,4,5);
			System.out.println("Valid Triangle");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
