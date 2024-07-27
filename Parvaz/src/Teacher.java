import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Teacher extends Person{
	
	private String department;
	
	public Teacher(String userName,String name,String phoneNumber,String email,String dateOfBirth,String department)
	{
		super(userName,name,phoneNumber,email,dateOfBirth);
		this.department=department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void createProfile() throws IOException
	{
		File teacherDir = new File("OEMS/Teacher");
		teacherDir.mkdir();
		File teacherNameDir = new File("OEMS/Teacher/"+getUserName());
		teacherNameDir.mkdir();
		File teacherProfiletxt = new File(teacherNameDir.getAbsolutePath() + "/profile.txt");
		teacherProfiletxt.createNewFile();
		FileWriter write = new FileWriter(teacherProfiletxt,true);
		write.write("Username:" + super.getUserName() + "\nName:"+super.getName() + "\nDepartment:"+getDepartment() +"\nPhonenumber:"+super.getPhoneNumber() + "\nEmail:"+super.getEmail() + "\nDate of birth:"+super.getDateOfBirth()+"\n");
		write.close();
	}

	@Override
	public String toString() {
		return "Teacher [department=" + department + "]";
	}
	
	

}
``		``     