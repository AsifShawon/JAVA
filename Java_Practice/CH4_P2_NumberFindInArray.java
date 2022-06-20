//Write a program to find out whether a given integer is present in an array or not.
package com.company;

import java.util.Scanner;

public class CH4_P2_NumberFindInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array element: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter number to find: ");
        int num = sc.nextInt();
        boolean numInArray = false;
        for(int i=0; i<n; i++)
            if(a[i]==num) {
                numInArray = true;
                break;
            }
        if(numInArray) System.out.println(num+" is in Array");
        else System.out.println(num+" is not in Array");
    }
}
