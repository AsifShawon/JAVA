/*
Write a Java program to find whether a year entered by the user is a leap year or not.
 */

package com.company;
import java.util.Scanner;
public class CH3_P4_LeapYearOrNot {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0))
            System.out.println(year+" is a leap year!!!");
        else
            System.out.println(year+" is not a leap year");
    }
}
