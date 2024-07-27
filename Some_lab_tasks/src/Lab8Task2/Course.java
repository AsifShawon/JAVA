package Lab8Task2;

public class Course {
    
    private String courseName;
    private int numberOfStudents;
    private int capacity;
    private Student[] students;
    
    
    public Course( String courseName, int capacity){
        this.courseName = courseName ;
        this.capacity = capacity;
        students = new Student[capacity];
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    
    public void addStudents(Student student) {
    	students[numberOfStudents] = student;
    	numberOfStudents++;
    }
    
    public void dropStudent(Student student) {
    	int indx = -1;
    	for(int i=0; i<numberOfStudents; i++) {
    		if(students[i].getId()==student.getId()) {
    			indx = i;
    		}
    	}
    	if(indx == -1) {
    		System.out.println("Student not found");
    		return;
    	}
    	for(int i=indx; i<numberOfStudents; i++) {
    		students[i] = students[i+1];
    	}
    	numberOfStudents--;
    	students[numberOfStudents] = null;
    }
    
    public void clear() {
    	students = null;
    	numberOfStudents = 0;
    }
    
}