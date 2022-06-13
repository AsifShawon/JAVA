/*
Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.bd – Bangladeshi website
 */
package com.company;
import java.util.Scanner;
public class CH3_P5_DomainNameDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your URL: ");
        String url = in.next();
        if(url.endsWith(".com")) System.out.println("Commercial Website");
        else if(url.endsWith(".org")) System.out.println("Organization Website");
        else if(url.endsWith(".bd")) System.out.println("Bangladeshi Website");
        else System.out.println("Wrong URL");
    }
}
