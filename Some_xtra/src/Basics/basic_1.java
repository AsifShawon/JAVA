package Basics;

import java.util.Scanner;

public class basic_1 {
	public static void main(String[] args) {
		// write a program that takes 10 positive integers 
		// and show the sum of them
		// but if user enters a negative integer ignore them 
		
		Scanner scanner = new Scanner(System.in);
		
		int num; // variable to take input of integers
		int count = 0;
		int sum = 0;
		while(count < 10) {
			num = scanner.nextInt();
			if(num < 0) {
				System.out.println("Please enter positive integer.");
			}
			else {
				sum += num;
				count++;
			}
		}
		
		System.out.println("Summation : "+sum);
	}
}
