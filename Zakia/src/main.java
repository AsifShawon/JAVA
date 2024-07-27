import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	static Scanner in = new Scanner(System.in);
	static String[][] student = {{"S1","password","A"},
						  {"S2","password","B"},
	                      {"S3","password","C"}};
	static String[][] teacher = {{"T1","password","A"},
						  {"T2","password","B"}};
	static String[][] courses = {{"Course A","1","A","T1"},
						{"Course A","2","A","T2"},
						{"Course A","3","B","T1"},
						{"Course B","1","A","T1"},
						{"Course C","1","B","T2"},
						{"Course C","2","C","T1"}};
	static String[] course = {"Course A","Course B","Course C"};
	static String[][] taken = new String[30][3]; // 0->course 1->section 2->student
	
	static void Teacher(String id,String pass) {
		int t_ind=-1;
		for(int i=0; i<teacher.length; i++) {
			if(teacher[0][0].equals(id) && teacher[0][1].equals(pass)) {
				t_ind = i;
				break;
			}
		}
		
		if(t_ind == -1) {
			System.out.println("Teacher not found\n");
			return;
		}
		
		System.out.println("Welcome Teacher "+id);
		System.out.println("1: View Course | 2: Logout");
		int choice = sc.nextInt();
		
		if(choice==1) {
			int ind = 1;
			for(int i=0; i<courses.length; i++) {
				if(courses[i][3].equals(id)) {
					System.out.println((ind++)+":"+courses[i][0]+"."+courses[i][1]);
				}
			}
			System.out.println(ind+":Back");
			choice = sc.nextInt();
			/*latter*/
		}
	}
	
	static void Student(String id, String pass) {
		int s_ind=-1;
		for(int i=0; i<student.length; i++) {
			if(student[0][0].equals(id) && student[0][1].equals(pass)) {
				s_ind = i;
				break;
			}
		}
		if(s_ind == -1) {
			System.out.println("Teacher not found\n");
			return;
		}
		
		System.out.println("Welcome "+id);
		System.out.println("1: Add Course | 2: View Course | 3: Back");
		int choice = sc.nextInt();
		System.out.println("Press 0 to go back");
		if(choice == 1) {
			for(int i=0; i<course.length; i++) {
				System.out.print((i+1)+ ": "+course[i]+" ");
			}
			System.out.print("Course selected:> ");
			int course_ind = sc.nextInt();
			System.out.print("Section Selected:> ");
			int sec_ind = sc.nextInt();
			if(taken.length==0) {
				taken[0][0] = course[course_ind-1];
				taken[0][1] = String.valueOf(sec_ind);
				taken[0][2] = id;
			}
			else {
				// at we need to check whether the 'id' is in the 'taken' array
				int available_at = -1;
				for(int i=0; i<taken.length; i++) {
					if(taken[i][2].equals(id) && taken[i][]) {
						available_at = i;
						if(taken[i][1].equals(sec_ind)) {
							System.out.println("You've already taken this course.");
						}
						break;
					}
				}
			}
		}
		else if(choice==2){
			
		}
		else {
			return;
		}
	}
	
	public static void main(String args[]) {
		boolean run = true;
		while(run) {
			System.out.println("Who are you?");
			System.out.print("1: Student | 2: Teacher\n>");
			int choice = sc.nextInt();
			
			if(choice==1)/*student*/ {
				System.out.print("ID: ");
				String id = in.next();
				System.out.print("Password: ");
				String pass = in.next();
				Student(id, pass);
			}
			else /*teacher*/ {
				System.out.print("ID: ");
				String id = in.next();
				System.out.print("Password: ");
				String pass = in.next();
				Teacher(id, pass);
			}
		}
	}
}
