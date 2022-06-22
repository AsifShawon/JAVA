/*
Write a program using recursive functions to print the following pattern:
   *
   **
   ***
   ****
 */

package com.company;

public class CH5_P3_Recursive_Pattern1 {
    static void pattern1(int n){
        if(n>0){
            pattern1(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
