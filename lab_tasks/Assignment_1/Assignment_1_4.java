/*
Q4. Take the mathematical series given below:
 
1/3 + 1/9 + 1/27 + ⋯ + 1/3^n
Here user will give the n as input and your job is to calculate the sum of this mathematical series.
*/
package lab_tasks;
import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        float sum = 0;
        int t=1;
        for(int i=1; i<=n; i++){
            t = t*3;
            sum = sum + (1f/t);
        }
        System.out.print("Summation of the series: "+sum);
    }
}
