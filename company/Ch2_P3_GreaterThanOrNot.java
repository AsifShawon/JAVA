/*
* Use comparison operators to find out whether a given number is greater than
the user entered number or not.
*/

package com.company;
import java.util.Scanner;
public class Ch2_P3_GreaterThanOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Given Number= 10\nEnter your number: ");
        int num = in.nextInt();
        System.out.println("10>"+num+" :"+(10>num));
    }
}
