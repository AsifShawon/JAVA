package Project;

public class AdminLogin extends Login {
	private static String type = "admin";
	public AdminLogin(String name, String pass) {
		super(type, name, pass);
	}
}