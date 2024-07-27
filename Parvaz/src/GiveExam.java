import java.io.*;
import java.util.*;

public class GiveExam extends Question{
	
	private String address;
	private ArrayList<Question> storeQuestion = new ArrayList<>();
	
	
	public GiveExam()
	{
		
	}
	
	public GiveExam(String address) throws IOException
	{
		this.address = address;
		readQuestion();
	}
	
	public void readQuestion() throws IOException
	{
		String line =null;
		BufferedReader read = new BufferedReader(new FileReader(this.address));
		while((line = read.readLine())!=null)
		{
			String data[] = line.split("!!!");
			//data[0]=question data[length-1]=ans  data[1 to length-2] = options
			
			String[] opt = new String[data.length-2];
			for(int i=0;i<data.length-2;i++)
			{
				opt[i] = data[i+1];
			}
			super.setNumOfOption(data.length-2);
			Question q = new Question(data[0],opt,data[data.length-1]);
			storeQuestion.add(q);
		}
		read.close();
	}
	
	public int getArraySize()
	{
		return storeQuestion.size();
	}
	
	public String getAddress() {
		return address;
	}

	public ArrayList<Question> getStoreQuestion() {
		return storeQuestion;
	}


}
