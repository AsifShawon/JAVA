import java.io.*;

public class Student extends Person{
	private String id;
	public Student(String userName,String name,String phoneNumber,String email,String dateOfBirth,String id)
	{
		super(userName,name,phoneNumber,email,dateOfBirth);
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void createProfile() throws IOException
	{
		File studentDir = new File("OEMS/Student");
		studentDir.mkdir();
		File studentNameDir = new File("OEMS/Student/"+getUserName());
		studentNameDir.mkdir();
		File studentProfiletxt = new File(studentNameDir.getAbsolutePath() + "/profile.txt");
		studentProfiletxt.createNewFile();
		FileWriter write = new FileWriter(studentProfiletxt,true);
		write.write("Username:" + super.getUserName() + "\nName:"+super.getName() + "\nId:"+getId() + "\nPhonenumber:"+super.getPhoneNumber() + "\nEmail:"+super.getEmail() + "\nDate of birth:"+super.getDateOfBirth() +"\n");
		write.close();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Student [id=" + id + "]";
	}
	
	

}
