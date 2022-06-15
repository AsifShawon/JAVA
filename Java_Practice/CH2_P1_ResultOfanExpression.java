/*
* What will be the result of the following expression:
float a = 7/4 * 9/2
*/

package com.company;

public class CH2_P1_ResultOfanExpression {
    public static void main(String[] args) {
        float a = 7.0f/4 * 9/2.0f;
        /*
        * 1st; 7/4 = 1.75
        * 2nd; 1.75*9 = 15.75
        * 3rd; 15.75/2 = 7.875
        */
        System.out.println(a);
    }
}
