package com.company;
import java.util.Scanner;
public class CH1_P4_KMtoMile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter km: ");
        float km = in.nextFloat();
        float mile = km*0.62f;
        System.out.println(km+" km = "+mile+" mile");
    }
}
