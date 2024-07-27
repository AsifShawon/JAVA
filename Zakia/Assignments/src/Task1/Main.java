package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[500000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }
        Stopwatch time_keeper = new Stopwatch();
        int n = numbers.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        time_keeper.stop();
        System.out.println("Time taken to sort an integer array of 5 lakh integers is: "+time_keeper.getElapsedTime() / 1000);
    }
}
