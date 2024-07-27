package Project;

public class UserLogin extends Login{
	private static String type= "user";
	public UserLogin(String name, String pass) {
		super(type,name,pass);
	}
}