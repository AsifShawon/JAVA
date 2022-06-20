package com.company;

import java.util.Scanner;

public class CH4_P5_ArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sorted = true;
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array element: ");
        for(int i=0; i<size; i++)
            a[i] = sc.nextInt();
        for(int i=0; i<size-1; i++){
            if(a[i]>a[i+1]) sorted = false;
        }

        if(sorted) System.out.println("Sorted Array");
        else System.out.println("Not Sorted Array");
    }
}
