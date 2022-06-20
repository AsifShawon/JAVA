/*
Q2. Take two integers as input from the user. Print all odd numbers that fall within the range of 
those two integers. For example, if user inputs 40 and 79, you have to print all odd numbers from 
40 to 79.
*/
package lab_tasks;
import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two number as range: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Odd number between "+n1+" & "+n2+": ");
        for(int i=n1; i<=n2; i++){
            if(i%2!=0) System.out.print(i+" ");
        }
    }
}
