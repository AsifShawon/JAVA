/*
Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	    Tax
-------------------
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	    30%

Note that there is not tax below 2.5L. Take the input amount as input from the user.
 */
package com.company;
import java.util.Scanner;
public class CH3_P2_CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float income,tax = 0.0f;
        System.out.println("Enter your income in Lakhs: ");
        income = in.nextFloat();
        if(income<2.5) tax = 0;
        else if(income>=2.5 && income<5.0){
            tax = (income-2.5f)*(5/100.0f);
        }
        else if(income>=5.0 && income<10.0) {
            tax = (income-5.0f)*(20/100.0f) + (5-2.5f)*(5/100.0f);
        }
        else {
            tax = (income-10.0f) * (30 / 100.0f) + (10-5.0f)*(20/100.0f) + (5-2.5f)*(5/100.0f);
        }
        System.out.println("Income Tax: "+tax);
    }
}
