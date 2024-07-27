package Task2;

import java.util.Scanner;

public class Task2_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int[] fibo_arr = new int[n];
        if (n >= 1) {
            fibo_arr[0] = 0;
        }
        if (n >= 2) {
            fibo_arr[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibo_arr[i] = fibo_arr[i - 1] + fibo_arr[i - 2];
        }
        
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo_arr[i] + " ");
        }
    }
}

