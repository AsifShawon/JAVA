
public class Question {
	
	private int numOfOption;
	private String que;
	private String[] option;
	private String ans;
	private String subject;
	
	public Question()
	{
		
	}
	
	public Question(int numOfOption,String subject)
	{
		this.numOfOption=numOfOption;
		this.subject=subject;
	}
	
	public Question(String que, String[] option, String ans)
	{
		this.que=que;
		this.option=option;
		this.ans=ans;
	}

	public int getNumOfOption() {
		return numOfOption;
	}

	public void setNumOfOption(int numOfOption) {
		this.numOfOption = numOfOption;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String[] getOption() {
		return option;
	}

	public void setOption(String[] option) {
		this.option = option;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	

}
