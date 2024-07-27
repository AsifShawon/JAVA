import java.io.*;
import java.util.*;

public class AvailableExam {
	ArrayList<String> examName = new ArrayList<>();
	ArrayList<String> examAddress = new ArrayList<>();
	private String line =null;
	
	public AvailableExam() throws IOException
	{
		readExamDetails();
	}
	
	public void readExamDetails() throws IOException
	{
		BufferedReader read = new BufferedReader(new FileReader("OEMS/Exam/Available Exams.txt"));
		int i=1;
		while((line = read.readLine())!=null)
		{
			String[] data = line.split(",");
			//data[0]=subject  data[1]=faculty  data[2]=Exam name  data[3]=Address
			examName.add(i + ". " + data[0] + "-" + data[1] + "-" + data[2]);
			
			examAddress.add(data[3]);
			i++;
		}
		read.close();
	}

	public ArrayList<String> getExamName() {
		return examName;
	}

	public ArrayList<String> getExamAddress() {
		return examAddress;
	}
	
	public int getArraySize()
	{
		return examName.size();
	}
	

}
