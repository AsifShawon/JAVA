/*
*Write the following expression in a java program:
s = (v^2-u^2)/2a
*/
package com.company;
import java.util.Scanner;
public class CH2_P4_Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float v,u,s,a;
        System.out.print("Enter u: ");
        u = in.nextFloat();
        System.out.print("Enter v: ");
        v = in.nextFloat();
        System.out.print("Enter a: ");
        a = in.nextFloat();
        s = (v*v-u*u)/(2*a);
        System.out.println("Distance,s = "+s);

    }
}
