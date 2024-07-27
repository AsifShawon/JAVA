package Project;

public class DriverLogin extends Login{
	private static String type = "driver";
	public DriverLogin(String name, String pass) {
		super(type, name, pass);
	}
}