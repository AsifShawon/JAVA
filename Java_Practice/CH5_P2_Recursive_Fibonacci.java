//Write a function to print the nth term of the Fibonacci series using recursion

package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CH5_P2_Recursive_Fibonacci {
    static int fibonacci(int n){
        if(n==1 || n==2)
            return n-1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = fibonacci(num);
        System.out.println(num+"th Fibonacci: "+result);
    }
}
