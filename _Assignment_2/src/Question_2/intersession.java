package Question_2;

import java.util.Scanner;

public class intersession extends NextSemester{
	private int studentSupport;
	
    public intersession(String name, int year, int studentSupport) {
        super(name, year);
        this.studentSupport = studentSupport;
    }
    
    @Override
    public void display() {
    	System.out.println("Six Month Semester");
    	super.display();
    }

    public void project() {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Do you have a project (yes/no)? ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Has a project");
        } else {
            System.out.println("No projects");
        }
    }
    
    @Override
    public int calculate() {
        return getYear() % 2;
    }
}
