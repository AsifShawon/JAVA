package Generics;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();

        // ArrayList<Integer>
        num.add(30);num.add(20);num.add(10);num.add(40); // adding numbers to the list
        System.out.println(num); // displaying the list
        num.add(5); // adding number end of the list
        num.add(2,60); // adding number at the index(2)
        System.out.println(num);
        Collections.sort(num); // sorting "num" ArrayList
        System.out.println(num); // after sorting
        Collections.reverse(num); // reversing "num" ArrayList
        System.out.println(num); // after reversing

        System.out.println("");

        // ArrayList<String>
        city.add("Dhaka");city.add("Noakhali");city.add("Syhlet");city.add("Khulna");
        System.out.println(city);
        city.add("Barishal");city.add(1,"Rangpur");
        System.out.println(city);
        Collections.sort(city);
        System.out.println(city);
        Collections.reverse(city);
        System.out.println(city);
    }
}

// output  :
/*
[30, 20, 10, 40]
[30, 20, 60, 10, 40, 5]
[5, 10, 20, 30, 40, 60]
[60, 40, 30, 20, 10, 5]

[Dhaka, Noakhali, Syhlet, Khulna]
[Dhaka, Rangpur, Noakhali, Syhlet, Khulna, Barishal]
[Barishal, Dhaka, Khulna, Noakhali, Rangpur, Syhlet]
[Syhlet, Rangpur, Noakhali, Khulna, Dhaka, Barishal]
 */