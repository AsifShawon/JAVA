package Task10;

import Task6.Address;

public class Main {
    public static void main(String[] args) {
		Address present = new Address(12, 2, "Dhaka", "Bangladesh", 1214);
		Address permenant = new Address(21, 12, "Chittagong", "Bangladesh", 1014);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", "Male", "1234567890", "john@example.com",present,permenant,"Company","Manager",5000.0,12.0);

        // Displaying FullTimeEmployee details
        System.out.println("Full-Time Employee Details:");
        System.out.println(fullTimeEmployee);
        System.out.println("Calculated Salary: " + fullTimeEmployee.calculateSalary());

        // Creating objects of PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("John Doe", "Male", "1234567890", "john@example.com",present,permenant,"Company","Delivery",5.0,120.0);

        // Displaying PartTimeEmployee details
        System.out.println("\nPart-Time Employee Details:");
        System.out.println(partTimeEmployee);
        System.out.println("Calculated Salary: " + partTimeEmployee.calculateSalary());
        
        Student student = new Student("Alice Smith", "Female", "1234567890", "alice@example.com",
                present, permenant,
                "XYZ University", "Computer Science", 3.8);

        // Displaying Student details
        System.out.println("Student Details:");
        System.out.println(student);
    }
}
