package Lab9;

public class Employee extends Person{
    private String id,department;
    private double salary;
    Employee(){
        super();
    }
    Employee(String name,int age,String gender, String id, String department, double salary){
        super(name,age,gender);
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return this.department;
    }
    public String getId() {
        return this.id;
    }
    public double getSalary() {
        return this.salary;
    }

    public void printInfo() {
        System.out.println(id+" "+department+" "+salary);
    }
    public String toString() {
        return super.toString()+id+" "+department+" "+salary+" ";
    }
}
