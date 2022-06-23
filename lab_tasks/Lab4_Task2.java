/*
 2.	Take an integer from user, generate that many fibonacci numbers and store in an array. Display the array.

Sample output:

Enter a number: 8
First 8 Fibonacci numbers: 0 1 1 2 3 5 8 13

 */
package lab_tasks;
import java.util.Scanner;

public class Lab4_Task2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a[] = new int[n];
        a[0] = 0;
        a[1] = 1;
        
        for(int i=2; i<n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        System.out.print("First "+n+" fibonacci number: ");
        for(int x: a){
            System.out.print(x+" ");
        }
    }

}
