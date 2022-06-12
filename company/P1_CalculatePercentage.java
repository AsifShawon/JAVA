package com.company;
import java.util.Scanner;

public class P1_CalculatePercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5,sum,per;
        System.out.print("Subject 1: ");
        sub1 = sc.nextFloat();
        System.out.print("Subject 2: ");
        sub2 = sc.nextFloat();
        System.out.print("Subject 3: ");
        sub3 = sc.nextFloat();
        System.out.print("Subject 4: ");
        sub4 = sc.nextFloat();
        System.out.print("Subject 5: ");
        sub5 = sc.nextFloat();
        sum = sub1+sub2+sub3+sub4+sub5;
        per = (sum/500.0f)*100.0f;
        System.out.print("Percentage of marks: ");
        System.out.println(per);
    }
}
