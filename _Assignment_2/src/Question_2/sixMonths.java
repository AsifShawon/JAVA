package Question_2;

public class sixMonths extends NextSemester{
private int studentSupport;
	
    public sixMonths(String name, int year, int studentSupport) {
        super(name, year);
        this.studentSupport = studentSupport;
    }
    
    @Override
    public void display() {
    	System.out.println("Six Month Semester");
    	super.display();
    }

    @Override
    public int calculate() {
        return getYear() % 6;
    }
}
