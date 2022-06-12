//Write a program to sum three numbers in Java.

package com.company;
import java.util.Scanner;
public class CH1_P1_AddingThreeNumbers {
    public static void main(String[] args){
        int a,b,c;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of three numbers: "+sum);

    }
}
