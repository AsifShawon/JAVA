package E_Voting;

public class Participant {
	private String name, dept, email;
	private int id, vote = 0;
	
	public Participant(String name, String dept,int id, String email, int vote) {
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.email = email;
		this.vote = vote;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	public int getVote() {
		return vote;
	}

	public void increaseVote() {
		vote++;
	}
	
	public String toString() {
		return name+"\t"+dept+"\t"+id+"\t"+email+"\t"+vote;
	}
}
