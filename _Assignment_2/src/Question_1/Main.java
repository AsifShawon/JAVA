package Question_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Semester name: ");
        String name = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        NextSemester session = new NextSemester(name, year);
        sixMonths sixMonths = new sixMonths(name, year, 2);
        fourMonths fourMonths = new fourMonths(name, year, 3);

        session.display();
        System.out.println("Session calculate: " + session.calculate());

        sixMonths.display();
        System.out.println("SixMonths calculate: " + sixMonths.calculate());

        fourMonths.display();
        System.out.println("FourMonths calculate: " + fourMonths.calculate());

        scanner.close();
    }
}
