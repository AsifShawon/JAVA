/*
* Write a program to find out whether a student is pass or fail; if it requires a total of 40%
and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
*/
package com.company;
import java.util.Scanner;
public class CH3_P1_PassOrFail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sub1,sub2,sub3;
        float avg;
        System.out.println("Enter three number of subject: ");
        sub1 = in.nextInt();
        sub2 = in.nextInt();
        sub3 = in.nextInt();

        avg = (sub1+sub2+sub3)/3.0f;

        if(sub1>=33 && sub2>=33 && sub3>=33 && avg>=40) System.out.println("Passed!!");
        else System.out.println("Failed!!");
    }
}
