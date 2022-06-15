//Question 2: Write a program to sum first n even numbers using a while loop.

package com.company;
import java.util.Scanner;
public class CH4_P2_AddEvenNumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int sum=0,c=1;
        for(int i=2; c<=n ; i+=2)
        {
            sum = sum + i;
            c++;
        }
        System.out.println("Sum of first "+n+" even numbers: "+sum);
    }
}
