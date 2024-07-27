package Task10;

import Task6.Address;

public class Employee extends Person {
    private String company;
    private String designation;

    // Constructor
    public Employee(String fullName, String gender, String phoneNum, String email, Address present, Address permenant, String company, String designation) {
        super(fullName, gender, phoneNum, email, present, permenant);
        this.company = company;
        this.designation = designation;
    }

    // Getters
    public String getCompany() {
        return company;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setCompany(String company) {
        this.company = company;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nEmployee Info\n" +
                "Company= " + company +
                "\nDesignation= " + designation;
    }
}
