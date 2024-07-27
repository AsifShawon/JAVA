package Inheritance_basic;

public class Main {
    public static void main(String []args) {
        Faculty fac = new Faculty("A", "M", 22, "1234", "ECE", 12000, "ABC", "3rd");
        Employee emp = new Employee("B", "F", 23, "4321", "BBA", 10000);
        Person per = new Person("C", "M", 20);
        
        fac.printInfo();
        System.out.println();
        emp.printInfo();
        System.out.println();
        per.printInfo();
    }
}