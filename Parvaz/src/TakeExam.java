import java.io.*;
import java.util.*;

public class TakeExam extends Question{
	private String time;
	private String qName;
	private int numOfQuestion;
	Question[] setQue;
	
	
	public TakeExam()
	{
		
	}
	
	public TakeExam(int numOfQuestion, int numberOfOption, String subject,String qName) throws IOException
	{
		super(numberOfOption,subject);
		this.numOfQuestion=numOfQuestion;
		this.qName=qName;
		
		
	}
	
	
	public void trySetQue(String[] q,String[][] opt, String ans[]) throws IOException
	{
		setQue = new Question[numOfQuestion];
		
		for(int i=0;i<numOfQuestion;i++)
		{
			setQue[i] = new Question(q[i],opt[i],ans[i]);
			
		}
		
		setExamQue();
	}
	
	public void setExamQue() throws IOException
	{
		
		File currentLogIn = new File("OEMS/current Login.txt");
		Scanner sc = new Scanner(currentLogIn); 
		String userName = sc.next();
		sc.close();
		File examDir = new File("OEMS/Exam");
		examDir.mkdir();
		File subjectDir = new File("OEMS/Exam/" + super.getSubject());
		subjectDir.mkdir();
		File userNameDir = new File(subjectDir.getAbsolutePath() +"/" + userName);
		userNameDir.mkdir();
		File writeQue = new File(userNameDir.getAbsolutePath() +"/" + qName + ".txt");
		writeQue.createNewFile();
		
		//for available exam list
		File examList = new File("OEMS/Exam/Available Exams.txt");
		examList.createNewFile();
		FileWriter write1 = new FileWriter(examList,true);
		write1.write(super.getSubject()+ "," + userName + "," + qName + "," +writeQue.getAbsolutePath()+"\n" );
		write1.close();
		
	
		for(int i=0;i<numOfQuestion;i++)
		{
			FileWriter write = new FileWriter(writeQue,true);
			
			write.write(setQue[i].getQue() + "!!!");
				
			for(int j=0;j<super.getNumOfOption();j++)
			{
				write.write((setQue[i].getOption())[j] + "!!!");
			}
			write.write(setQue[i].getAns() + "!!!\n");
				
			write.close();
			
		}
		
		
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public int getNumOfQuestion() {
		return numOfQuestion;
	}

	public void setNumOfQuestion(int numOfQuestion) {
		this.numOfQuestion = numOfQuestion;
	}

	public Question[] getSetQue() {
		return setQue;
	}

	public void setSetQue(Question[] setQue) {
		this.setQue = setQue;
	}
	
	

}
