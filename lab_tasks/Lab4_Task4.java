/*
 Take an integer array and print only the numbers that are in consecutive orders of 3.

Enter size: 12

Enter numbers: 1 2 3 2 2 2 11 4 4 4 3 3

Output: 2 4

 */
package lab_tasks;
import java.util.Scanner;

public class Lab4_Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        int count;
        System.out.print("Output: ");
        for(int i=0; i<size; i++){
            count=1;
            for(int j=i+1; j<size; j++){
                if(a[i]==a[j]) count++;
            }
            if(count==3) System.out.print(a[i]+" ");
        }
    }
}
