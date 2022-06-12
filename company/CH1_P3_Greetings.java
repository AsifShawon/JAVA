package com.company;
import java.util.Scanner;
public class CH1_P3_Greetings {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();
        System.out.println("Hello "+str+", Have a great day!");
    }
}
