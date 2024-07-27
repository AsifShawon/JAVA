package Lab8Task2;

public class Student {

    private String name;
    private long id ;
    private String department ;
    private double cgpa ;
    private double completedCredits ;


    public Student (){

        name = " " ;
        id = 0 ;
        department = "" ;
        cgpa = 0;
        completedCredits = 0 ;
    }

    public Student ( String name , long id, String department , double cgpa, double completedCredits ){

        this.name = name ;
        this.id = id ;
        this.department = department ;
        this.cgpa = cgpa ;
        this.completedCredits = completedCredits ;

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public double getCompletedCredits() {
        return completedCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setCompletedCredits(double completedCredits) {
        this.completedCredits = completedCredits;
    }

    @Override
    public String toString() {
        return "Student{" + " Name=" + name + " Id=" + id + ", DDepartment=" + department + ", CGPA=" + cgpa + ", Completed Credits=" + completedCredits + '}';
    }



}

