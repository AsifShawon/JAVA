
package lab_tasks;

/**
2.Write a program that takes an integer and determines if 
 it’s prime or not. A number is prime if it is divisible by 
1 and itself only, i.e. 2, 3, 11, 37 etc.
*/
import java.util.Scanner;
public class lab2_p2_PrimeNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num,i,prime=0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        for(i=2; i<num; i++)
        {
            if(num%i==0) {
                prime = 1;
                break;
            }
        }
        if(prime==0) System.out.println(num+" is a prime number");
        else System.out.println(num+" is not a prime number");
    }
    
}
