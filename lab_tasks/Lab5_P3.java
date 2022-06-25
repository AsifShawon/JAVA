/*
 3.	Write a program that has the following static variable - balance (initial value 0) and these static methods:

deposit(double amount): Increase account balance

withdraw(double amount): Decrease account balance

Now run an infinite loop in main program so it displays user with following options:

1.	Deposit

2.	Withdraw

3.	Balance

4.	Exit

Under each option, the program should ask for appropriate user input (i.e. amount to deposit).

 */
package lab_tasks;

import java.util.Scanner;

class Bank {
    double balance;

    void withdraw(double w) {
        balance -= w;
    }

    void deposit(double d) {
        balance += d;
    }
}

public class Lab5_P3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        Bank b = new Bank();
        double balance;
        while (run) {
            System.out.println("Options>>>");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter Amount to Deposit: ");
                double amount = sc.nextDouble();
                b.deposit(amount);
            } 
            else if (choice == 2) {
                System.out.print("Enter Amount to Withdraw: ");
                double amount = sc.nextDouble();
                b.withdraw(amount);
            } 
            else if (choice == 3) {
                System.out.println("Current balance: " + b.balance);
            } 
            else if (choice == 4) {
                run = false;
            }

            if (run == false) {
                System.out.println("Thanks for choosing us <3");
            }
        }
    }

}
