/*
 1.	Declare an integer array of size 6, initialize it with user input, calculate and print the average. Now calculate the percentage of numbers that are above that average.

For example: if 3 of the array elements are greater than average, percentage is: 3 * 100 / 6 = 50%

 */
package lab_tasks;

import java.util.Scanner;

public class Lab4_Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 0, a[] = new int[6];
        float s = 0;
        
        System.out.print("Enter 6 number: ");
        for (int i = 0; i < 6; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            s += a[i];
        }

        float avg = s / 6;
        for (int i = 0; i < 6; i++) {
            if (a[i] > avg) {
                c++;
            }
        }
        float persentage = c * 100 / 6;
        System.out.println("Avg: " + avg + "\nPersantage: " + persentage);
    }

}
