package Task1;

import java.util.Scanner;

public class Array_task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		int sum = 0;
		
		System.out.print("Enter 6 numbers: ");
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		double avg = sum/6.0;
		System.out.println("Average: "+avg);
		
		int avobe_avg = 0;
		for(int i=0; i<6; i++) {
			if(arr[i]>avg) {
				avobe_avg++;
			}
		}
		
		System.out.println("Percantage of avobe average numbers: "+avobe_avg*100/6+"%");
	}}
