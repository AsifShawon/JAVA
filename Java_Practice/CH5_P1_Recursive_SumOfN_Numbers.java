//Write a recursive function to calculate the sum of first n natural numbers.

package com.company;

import java.util.Scanner;

public class CH5_P1_Recursive_SumOfN_Numbers {
    static int sum(int n){
        if(n==0)
            return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of "+num+" natural numbers: "+sum(num));
    }
}
