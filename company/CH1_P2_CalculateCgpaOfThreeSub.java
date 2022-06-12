//Write a program to calculate CGPA using marks of three subjects (out of 100)

package com.company;
import java.util.Scanner;
public class CH1_P2_CalculateCgpaOfThreeSub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sub1,sub2,sub3;
        System.out.println("Enter Marks of Three Subjects");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        float sum = sub1+sub2+sub3;
        float cgpa = sum/(30);
        System.out.println("CGPA: "+cgpa);
    }
}
