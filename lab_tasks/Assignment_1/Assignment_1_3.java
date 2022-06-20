/*
Q3. Take two integer inputs from user and store them in a and b. Now calculate a to the power of 
b (a^b).
*/
package lab_tasks;
import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a and b: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int p = 1;
    for(int i=1; i<=b; i++){
        p = p*a;
    }
    System.out.print(a+"^"+b+"= "+p);
    }
}
