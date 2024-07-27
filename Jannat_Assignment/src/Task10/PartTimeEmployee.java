package Task10;

import Task6.Address;

public class PartTimeEmployee extends Employee {
    private double hours;
    private double rate;

    // Constructor
    public PartTimeEmployee(String fullName, String gender, String phoneNum, String email, Address present, Address permenant, String company, String designation, double hours, double rate) {
        super(fullName, gender, phoneNum, email, present, permenant, company, designation);
        this.hours = hours;
        this.rate = rate;
    }

    // Getters
    public double getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    // Setters
    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nPart-Time Employee Info\n" +
                "Hours= " + hours +
                "\nRate= " + rate;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return hours * rate;
    }
}
