package task2;

public class Main {
    public static void main(String[] args) {
        try {
            Account account = new Account("123456789", 500.0);

            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Initial Balance: " + account.getBalance());

            account.deposit(150.0);
            System.out.println("Balance after deposit: " + account.getBalance());

            try {
                account.withdraw(200.0);
                System.out.println("Balance after withdrawal: " + account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println("Withdrawal failed: " + e.getMessage());
            }

            try {
                account.withdraw(500.0);
                System.out.println("Balance after withdrawal: " + account.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println("Withdrawal failed: " + e.getMessage());
            }

            try {
                account.deposit(-50.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Deposit failed: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create account: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
