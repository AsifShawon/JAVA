//Assignment 1
// Md. Asif Ibn Kamal Bhuiyan - 2131663642

import java.util.Scanner;
class BankAccount{
    private int balance;
    private String name;
    BankAccount(){
        name = "Your-name-here";
        balance = 0;
    }
    BankAccount(int a){
        name = "Your-name-here";
        balance = a;
    }
    BankAccount(String s, int a){
        name = s;
        balance = a;
    }
    BankAccount(BankAccount acc){
        name = acc.name;
        balance = acc.balance;
    }
    private void deposit(int a){
        balance +=a;
    }
    private void withdraw(int a){
        balance -= a;
    }

    void wantToDeposit(int a){
        if(a>500 && a<=500000){
            deposit(a);
        }
        else{
            System.out.println("Sorry! Deposit range -> 500 to 500000");
        }
    }
    void wantToWithdraw(int a){
        if(balance<a){
            System.out.println("Sorry!, You have not enough balance!");
        }
        else{
            withdraw(a);
        }
    }
    int getBalance(){
        return balance;
    }
    private void changeName(String name){
        this.name = name;
    }
    void wantToChangeName(String name){
        changeName(name);
    }
    String getName(){
        return name;
    }

}
public class ID2131663642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account[] = new BankAccount[4];
        account[0] = new BankAccount();
        account[1] = new BankAccount(1200);
        account[2] = new BankAccount("Asif", 1000);
        account[3] = new BankAccount(account[2]);
        boolean run = true;
        while (run) {
            System.out.print("Choose Account(0/1/2/3)(Enter \"-1\" to exit): ");
            int choice = sc.nextInt();
            if(choice==-1) run = false;
            boolean run2 = true;
            while (run2) {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Details(balance+name)");
                System.out.println("4. Change Name");
                System.out.println("5. Exit");
                System.out.print("Choice:(1/2/3/4/5)");
                int choice2 = sc.nextInt();
                if(choice2==1){
                    System.out.println("Enter ammount: ");
                    int ammount = sc.nextInt();
                    account[choice].wantToDeposit(ammount);
                }
                else if(choice2==2){
                    System.out.print("Enter ammount: ");
                    int ammount = sc.nextInt();
                    account[choice].wantToWithdraw(ammount);
                }
                else if(choice2==3){
                    System.out.println("Name: "+account[choice].getName());
                    System.out.println("Balance: "+account[choice].getBalance());
                }
                else if(choice2==4){
                    System.out.print("Enter your name: ");
                    String s = sc.next();
                    account[choice].wantToChangeName(s);
                }
                else {
                    System.out.println("Thanks");
                    run2 = false;
                }
            }
        }
    }
}