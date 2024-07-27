import java.io.*;

public class Admin {
	
	private String teacherUserName;
	
	
	public Admin()
	{
		
	}
	
	public Admin(String teacherUserName) throws IOException
	{
		this.teacherUserName=teacherUserName;
		assingTeacher();
	}
	
	public void assingTeacher() throws IOException
	{
		File file = new File("OEMS/Assinged Teacher.txt");
		file.createNewFile();
		
		FileWriter write = new FileWriter("OEMS/Assinged Teacher.txt",true);
		write.write(this.teacherUserName + "\n");
		write.close();
	}

}

/*

 */
