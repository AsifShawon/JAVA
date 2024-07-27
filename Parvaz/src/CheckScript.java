import java.util.*;
import java.io.*;

public class CheckScript {
	private ArrayList<Question> teacherQ = new ArrayList<>();
	private String[] studentAns;
	String examName;
	
	public CheckScript(ArrayList<Question> teacherQ, String[] studentAns, String examName) throws IOException
	{
		this.teacherQ=teacherQ;
		this.studentAns=studentAns;
		this.examName=examName;
		studentHistory();
		studentRecord();
	}
	
	public int getMarks()
	{
		int mark=0;
		for(int i=0;i<teacherQ.size();i++)
		{
			if((this.teacherQ.get(i).getAns()).equals(this.studentAns[i]))
			{
				mark++;
			}
		}
		return mark;
	}
	
	public void studentHistory() throws IOException
	{
		Scanner read = new Scanner("OEMS/current Login.txt");
		String username = read.nextLine();
		read.close();
		File studentHistory = new File("OEMS/Student/"+ username +"/Exam History.txt");
		studentHistory.createNewFile();
		FileWriter write = new FileWriter(studentHistory,true);
		write.write(examName + " Obtain Marks: " + this.getMarks() + "\n");
		write.close();
		
	}
	
	public void studentRecord() throws IOException
	{
		String[] data = this.examName.split("-");
		//  data[0] = subject data[1] = faculty  data[2]= question name
		
		Scanner read = new Scanner("OEMS/current Login.txt");
		String username = read.nextLine();
		read.close();
		
		
		String line=null;
		String stdntName=null;
		String stdntId=null;
		
		BufferedReader readProfile = new BufferedReader(new FileReader("OEMS/Student/" + username + "/profile.txt"));
		while((line=readProfile.readLine())!=null)
		{
			String[] stdntData = line.split(":");
			//stdntData[0]=field stdntData[1]=Content
			
			if(stdntData[0].equals("Name"))
			{
				stdntName = stdntData[1];
			}
			
			else if(stdntData[0].equals("Id"))
			{
				stdntId = stdntData[1];
			}

		}
		readProfile.close();
		
		File studentExamRecord = new File("OEMS/Teacher/" + data[1] + "/" + data[0] + data[2] + "txt");
		studentExamRecord.createNewFile();
		
		FileWriter write = new FileWriter(studentExamRecord);
		write.write(stdntName + stdntId + ":" + this.getMarks() + "\n");
		write.close();
		
		
	}

}
