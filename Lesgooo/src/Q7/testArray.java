package Q7;

import java.util.Scanner;

public class testArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size(1): ");
        int size_1 = scanner.nextInt();
        Array array1 = new Array(size_1);
        array1.createArray();
        System.out.println("Array 1 summation: "+array1.summation());

        System.out.print("Enter the array size(2): ");
        int size_2 = scanner.nextInt();
        Array array2 = new Array(size_2);
        array2.createArray();
        System.out.println("Array 2 summation: "+array2.summation());
    }
}
