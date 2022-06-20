//Create an array of 5 floats and calculate their sum.

package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CH4_P1_SumOfFloatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 float elements: ");
        float arr[] = new float[5];
        float sum=0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextFloat();
            sum = arr[i] + sum;
        }
        System.out.println("Summation: "+sum);
    }
}
