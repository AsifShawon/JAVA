/*
Question 5: Write a program to find the factorial of a given number using for loops.
 */

package com.company;
import java.util.Scanner;
public class CH4_P3_FactorialWithLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
}
