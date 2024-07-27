package Question_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Semester name: ");
        String name = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        intersession intersession1 = new intersession(name, year, 2);
        intersession intersession2 = new intersession(name, year, 2);

        intersession1.display();
        System.out.println("Intersession1 calculate: " + intersession1.calculate());
        intersession1.project();

        intersession2.display();
        System.out.println("Intersession2 calculate: " + intersession2.calculate());
        intersession2.project();

        scanner.close();
    }
}
