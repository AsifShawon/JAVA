package Lab8Task2;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Jannat",12,"ECE",3.66,50);
		Student s2 = new Student("Ferdous",13,"ECE",3.11,30);
		Student s3 = new Student("Lakia",14,"ECE",3.06,50);
		
		Student[] students;
		
		Course course1 = new Course("CSE215", 10);
		course1.addStudents(s3);
		course1.addStudents(s2);
		course1.addStudents(s1);
		System.out.println(course1.getNumberOfStudents());
		course1.dropStudent(s3);
		System.out.println(course1.getNumberOfStudents());
		
		students = course1.getStudents();
		for(int i=0; i<course1.getNumberOfStudents(); i++) {
			System.out.println(students[i]);
		}
	}
}
