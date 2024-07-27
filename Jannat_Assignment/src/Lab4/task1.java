package Lab4;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		int []arr = new int[10];
		int min = 1;
		int max = 20;
		int n;
		for(int i=0; i<10; i++) {
			n = (int)(min+Math.random()*(max-min+1));
			arr[i] = n;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean found = false;
		for(int i=0; i<10; i++) { 
			if(arr[i]==num) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("FOUND");
		}
		else {
			System.out.println("NOT FOUND");
		}
	}
}
