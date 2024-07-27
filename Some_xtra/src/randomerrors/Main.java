package randomerrors;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0;  i<100; i++) {
			int n = (int)(Math.random()*100);
			arr[i] = n;
		}
		
		File file = new File("errors.txt");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index: ");
		int index = sc.nextInt();
		
		try {
			System.out.println(arr[index]);
			System.out.print("Enter a Number: ");
			int num = sc.nextInt();
			System.out.println(arr[index]/num);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			try {
				FileWriter fw = new FileWriter(file,true);
				fw.write(e.getMessage()+"\n");
				fw.close();
			}
			catch(IOException io) {
				System.out.println(io.getMessage());
			}
		}
		finally {
			System.out.println("Program Ends !");
		}
  	}
}
