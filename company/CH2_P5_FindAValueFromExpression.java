/*
* Find the value of 'a' in expression given below :
int x = 7
int a = 7*49/7 + 35/7
*/

package com.company;

public class CH2_P5_FindAValueFromExpression {
    public static void main(String[] args) {
        int a;
        a = 7*49/7 + 35/7;
        /*
        * 7*49/7+35/7
        * 343/7 + 5
        * 49 + 5
        * 54
         */
        System.out.println(a);
    }
}
