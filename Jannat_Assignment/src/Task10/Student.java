package Task10;

import Task6.Address;

public class Student extends Person {
    private String university;
    private String department;
    private double cgpa;

    // Constructor
    public Student(String fullName, String gender, String phoneNum, String email, Address present, Address permenant, String university, String department, double cgpa) {
        super(fullName, gender, phoneNum, email, present, permenant);
        this.university = university;
        this.department = department;
        this.cgpa = cgpa;
    }

    // Getters
    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Setters
    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nStudent Info\n" +
                "University= " + university +
                "\nDepartment= " + department +
                "\nCGPA= " + cgpa;
    }
}
