import java.util.ArrayList;

public class User {
	private String email;
	private String password;
	private String name;
	private String id;
	private double CGPA;
	public String[] courses = new String[3];
	
	public User()
	{
		
	}
	
	public User(String email,String password, String name)
	{
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}


	
	
	
	
	
	

}
