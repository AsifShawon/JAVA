package Class1;
import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		// data types
		// int float double char
		// String boolean
//		String str1 = "New String ";
//		String str2 = "2nd String";
//		String str3 = str1 + str2;
//		
//		System.out.println(str3);
		
		// input
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(); // to take integer input
		
		// string input
//		System.out.print("Enter your name: ");
//		String name = sc.nextLine();
//		System.out.println("Name: "+name);
		
		// addition
//		int a,b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		String c = sc.next();
//		
//		System.out.println("Addition: "+(a+b+c));
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
//		for(int i=0; i<9; i++) {
//			System.out.println(a[i]);
//		}
		
		// for each
		for(int i:a) {
			// i = a[0]
			System.out.println(i);
		}
		
		
	}
}
