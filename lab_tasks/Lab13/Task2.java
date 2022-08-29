package Lab13;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int a[] = new int[100];
		
		for(int i=0 ; i<100; i++) {
			a[i] = (int) (Math.random() * 10000);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index: ");
		int indx = sc.nextInt();
		
		try {
			System.out.println(a[indx]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
