package Task3;

import java.util.Scanner;

public class Task3_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Output: ");
        for (int i = 1; i < size - 1; i++) {
            if (numbers[i] == numbers[i - 1] && numbers[i] == numbers[i + 1]) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

