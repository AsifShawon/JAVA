import java.io.*;

public class LogIn implements Match{
	private String userName;
	private String password;
	private int userType;
	
	public LogIn(int userType,String userName,String password) throws IOException
	{
		this.userType = userType;
		this.userName=userName;
		this.password=password;
		//System.out.println(isMatched());
		
	}
	
	public boolean isMatched() throws IOException
	{
		if(userType==0)
		{
			File signUptxt = new File("OEMS/Student Signup.txt");
			signUptxt.createNewFile();
			BufferedReader read = new BufferedReader(new FileReader("OEMS/Student Signup.txt"));
			String line = null;
			while((line=read.readLine())!=null)
			{
				String data[] = line.split(",");
				//data[0]=username   data[1]=pass
				
				if(data[0].equals(getUserName())&& data[1].equals(getPassword()))
				{
					File currentLogIn = new File("OEMS/current Login.txt");
					currentLogIn.createNewFile();
					FileWriter write = new FileWriter("OEMS/current Login.txt");
					write.write(getUserName());
					write.close();
					read.close();
					return true;
				}
			}
			read.close();
			return false;
		}
		
		else if(userType==1)
		{
			File signUptxt = new File("OEMS/Teacher Signup.txt");
			signUptxt.createNewFile();
			BufferedReader read = new BufferedReader(new FileReader("OEMS/Teacher Signup.txt"));
			String line = null;
			while((line=read.readLine())!=null)
			{
				String data[] = line.split(",");
				//data[0]=username   data[1]=pass
				
				if(data[0].equals(getUserName())&& data[1].equals(getPassword()))
				{
					File currentLogIn = new File("OEMS/current Login.txt");
					currentLogIn.createNewFile();
					FileWriter write = new FileWriter("OEMS/current Login.txt");
					write.write(getUserName());
					write.close();
					read.close();
					return true;
				}
			}
			read.close();
			return false;
		}
		
		else if(userType==2)
		{
			if(getUserName().equals("Admin")&& getUserName().equals("Admid"))
			{
				return true;
			}
		}
		return false;
	}
		
		

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	
	
	

}
