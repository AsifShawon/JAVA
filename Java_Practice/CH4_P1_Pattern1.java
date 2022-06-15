/*
Question 1: Write a program to print the following pattern :

****

***

**

*
 */

package com.company;

public class CH4_P1_Pattern1 {
    public static void main(String[] args) {
        System.out.println("Pattern\n");
        for(int i=1; i<=4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
