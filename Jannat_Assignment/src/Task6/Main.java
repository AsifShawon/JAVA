package Task6;

public class Main {
	public static void main(String[] args) {
		Address present = new Address(12, 2, "Dhaka", "Bangladesh", 1214);
		Address permenant = new Address(21, 12, "Chittagong", "Bangladesh", 1014);
		
		Person person = new Person("Jannat Akter","Female", "01234567891", "jannat@gmail.com", present, permenant);
		
		System.out.println(person);
	}
}
