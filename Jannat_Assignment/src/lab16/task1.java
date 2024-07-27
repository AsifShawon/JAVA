package lab16;

import java.io.*;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fl = new File("src\\lab16\\Numbers.txt");
        int num;

        System.out.println("Enter positive integers (negative number to stop): ");

        try (FileWriter file = new FileWriter(fl)) {
            while (true) {
                num = sc.nextInt();
                if (num < 0) break;
                file.write(num + System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found " + e);
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }

        try (Scanner fileScanner = new Scanner(fl)) {
            int sum = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                sum += number;
                count++;
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No numbers were entered.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found " + e);
        }
    }
}
