package Question_7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hours for Table: ");
        int tableHours = scanner.nextInt();

        System.out.print("Enter the hours for Chair: ");
        int chairHours = scanner.nextInt();

        System.out.print("Enter the hours for Sofa: ");
        int sofaHours = scanner.nextInt();

        Table table = new Table("Table", tableHours);
        Chair chair = new Chair("Chair", chairHours);
        Sofa sofa = new Sofa("Sofa", sofaHours);

        double totalCost = table.expenditure() + chair.expenditure() + sofa.expenditure();
        System.out.println("Total cost: " + totalCost);

        scanner.close();
    }
}
