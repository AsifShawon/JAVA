package Question_1;

public class fourMonths extends NextSemester {
	private int studentSupport;
	
    public fourMonths(String name, int year, int studentSupport) {
        super(name, year);
        this.studentSupport = studentSupport;
    }
    
    @Override
    public void display() {
    	System.out.println("Four Month Semester");
    	super.display();
    }

    @Override
    public int calculate() {
        return getYear() % 4;
    }
}