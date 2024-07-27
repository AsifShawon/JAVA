package Quiz;

public class Quiz {
	
	private int ID;
	private double mark;
	
	public Quiz(int ID, double mark) {
		this.ID = ID;
		this.mark = mark;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "ID: "+ID+" mark: "+mark;
	}
	
	
}
