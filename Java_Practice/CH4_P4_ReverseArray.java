package com.company;

import java.util.Scanner;

public class CH4_P4_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array Elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0; i<size/2; i++){ //we run the for loop upto middle of the array
            temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        for (int element: arr) {
            System.out.print(element+" ");

        }
    }
}
