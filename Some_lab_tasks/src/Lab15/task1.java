package Lab15;

import java.util.Scanner;

public class task1 {
	
	public static void checkNegative(int num) throws negativeNumberException{
		if(num < 0) {
			throw new negativeNumberException();
		}
	}
	
	public static void main(String[] args) {
		int[] arr  = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int val;
		int count = 0;
		int sum = 0;
		while(count < 10) {
			val = sc.nextInt();
			try {
				checkNegative(val); // check whether there is an exception or not
				arr[count] = val;
				sum += arr[count];
				count++;
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.println("Summation: "+sum);
	}
}
