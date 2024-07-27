package Q1;

import java.util.Scanner;

public class testMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mathbooks book1 = new Mathbooks();
        String name = "Harry Potter";
        int year = 1993;
         book1.setName(name);
         book1.setYear(year);
         System.out.println(book1.display());

         // user input
        System.out.print("\nEnter Book name: ");
        name = scanner.nextLine();
        System.out.print("Enter year of publishing: ");
        year = scanner.nextInt();

        Mathbooks book2 = new Mathbooks(name,year);
        System.out.println(book2.display());
        System.out.println("Sum of Diagonal: "+book2.calculate());
    }
}
