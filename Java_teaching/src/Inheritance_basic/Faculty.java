package Inheritance_basic;

public class Faculty extends Employee{
	private String initial, rank;
	
	public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, 
			String rank) {
		super(name,gender,age,id,department,salary);
		this.initial = initial;
		this.rank = rank;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Initial: "+initial);
		System.out.println("Rank: "+rank);
	}

}
