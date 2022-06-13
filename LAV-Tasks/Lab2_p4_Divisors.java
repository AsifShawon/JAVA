package labe_tasks;

//Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 6.

import java.util.Scanner;
public class Lab2_p4_Divisors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Divisors of "+num+" are ");
        for(int i=1; i<num; i++)
        {
            if(num%i==0) System.out.print(i+" ");
        }
    }
    
}
