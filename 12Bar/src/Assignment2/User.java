package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class User{
    private String email;
    private String password;
    private String name;
    private String id;
    private double CGPA;
    public String[] courses = new String[3];

    public User() {

    }

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

}

class Teacher extends User implements Action {

    @Override
    public void handleAction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. View Course");
        System.out.println("2. Logout");

        int choice = sc.nextInt();
        if(choice==1) {
//            String
        }
    }

}
class Student extends User implements Action {

    @Override
    public void handleAction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Course");
        System.out.println("2. Remove Course");
        System.out.println("3. View Course");

        int choice = sc.nextInt();
        if(choice==1) {
//            String
        }
    }

}
class Ta extends User implements Action {

    @Override
    public void handleAction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Course");
        System.out.println("2. Remove Course");
        System.out.println("3. View Course");

        int choice = sc.nextInt();
        if(choice==1) {
            
        }
    }

}
