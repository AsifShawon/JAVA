package Lab13;

import java.util.Scanner;

public class Task1 {

	static void CheckPosOrNeg(int a) throws negativeNumberException {
		if (a < 0)
			throw new negativeNumberException();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, sum = 0;
		while (i <= 10) {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();

			try {
				CheckPosOrNeg(num);
				sum += num;
			} catch (Exception e) {
				System.out.println("Input positive integer only");
				i--;
			} finally {
				i++;
			}
		}
		System.out.println("Sum of the 10 positive numbers: " + sum);
	}

}
