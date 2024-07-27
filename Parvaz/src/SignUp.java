import java.io.*;

public class SignUp extends Person{
	
	private String password;
	private int userType;
	private String deptOrId;
	
	public SignUp(int userType,String userName,String password,  String name,String phoneNumber,String email,String dateOfBirth,String deptOrId) throws SignUp.NotAssingedException,SignUp.UniqueUserNameException, IOException
	{
		super(userName,name,phoneNumber,email,dateOfBirth);
		this.userType=userType;
		this.password=password;
		this.deptOrId=deptOrId;
		
		createAccount(userName,this.password);
		
		
		
	}
	
	public void createAccount(String userName,String password) throws IOException, SignUp.UniqueUserNameException, SignUp.NotAssingedException 
	{
		File dir = new File("OEMS");
		dir.mkdir();
		File teacherSignUptxt = new File(dir.getAbsolutePath()+"/Teacher Signup.txt");
		teacherSignUptxt.createNewFile();
		File studentSignUptxt = new File(dir.getAbsolutePath()+"/Student Signup.txt");
		studentSignUptxt.createNewFile();
		if(this.userType==0)
		{
			if(checkUserName(userName,studentSignUptxt))
			{
				FileWriter write = new FileWriter(studentSignUptxt,true);
				write.write(userName + "," + password + "\n");
				write.close();
				createProfile(userType,userName,super.getName(),super.getPhoneNumber(),super.getEmail(),super.getDateOfBirth(),deptOrId);
			}
			else
			{
				throw new SignUp.UniqueUserNameException(userName);
			}
		}
		
		else if(this.userType==1)
		{
			if(isAssinged(userName))
			{
				if(checkUserName(userName,teacherSignUptxt))
				{
					FileWriter write = new FileWriter(teacherSignUptxt,true);
					write.write(userName + "," + password + "\n");
					write.close();
					createProfile(userType,userName,super.getName(),super.getPhoneNumber(),super.getEmail(),super.getDateOfBirth(),deptOrId);
				}
				else
				{
					throw new SignUp.UniqueUserNameException(userName);
				}
			}
			else
			{
				throw new SignUp.NotAssingedException(userName);
			}
			
		}
		
		
		
	
	}
	
	
	public boolean isAssinged(String userName) throws IOException
	{
		BufferedReader read = new BufferedReader(new FileReader("OEMS/Assinged Teacher.txt"));
		String line=null;
		while((line = read.readLine())!=null)
		{
			if(line.equals(userName))
			{
				read.close();
				return true;
			}
				
		}
		read.close();
		return false;
	}
	
	public boolean checkUserName(String userName, File fileName) throws IOException
	{
		BufferedReader read = new BufferedReader(new FileReader(fileName));
		String line =null;
		while((line=read.readLine())!=null)
		{
			String[] data = line.split(",");
			//data[0]=username  data[1]=password
			
			if(data[0].equals(userName))
			{
				read.close();
				return false;
			}
		}
		read.close();
		return true;
	}
	
	
	
	public class UniqueUserNameException extends Exception{
		private String userName;
		public UniqueUserNameException(String userName)
		{
			super("Username must be unique");
			this.userName=userName;
		}
		public String getUserName() {
			return userName;
		}
			
	}
	
	public class NotAssingedException extends Exception{
		private String userName;
		public NotAssingedException(String userName)
		{
			super("No teacher is Assigned with this Username.");
			this.userName=userName;
		}
		public String getUserName() {
			return userName;
		}
			
	}
	
	public void createProfile(int userType,String userName, String name,String phoneNumber,String email,String dateOfBirth,String deptOrId) throws IOException
	{
		if(userType==0)
		{
			//student
			Student student = new Student(userName,name,phoneNumber,email,dateOfBirth,deptOrId);
			student.createProfile();
		}
		else if(userType==1)
		{
			//teacher
			Teacher teacher = new Teacher(userName,name,phoneNumber,email,dateOfBirth,deptOrId);
			teacher.createProfile();
		}
	}
	
	
	

}
