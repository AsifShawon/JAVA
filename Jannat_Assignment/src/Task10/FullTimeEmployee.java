package Task10;

import Task6.Address;

public class FullTimeEmployee extends Employee {
    private double basic;
    private double allowance;

    // Constructor
    public FullTimeEmployee(String fullName, String gender, String phoneNum, String email, Address present, Address permenant, String company, String designation, double basic, double allowance) {
        super(fullName, gender, phoneNum, email, present, permenant, company, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    // Getters
    public double getBasic() {
        return basic;
    }

    public double getAllowance() {
        return allowance;
    }

    // Setters
    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nFull-Time Employee Info\n" +
                "Basic Salary= " + basic +
                "\nAllowance= " + allowance;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return basic + allowance;
    }
}
