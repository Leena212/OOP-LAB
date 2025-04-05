
package bank.simulation.core;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager manager = new AccountManager();
        
        while (true) {
            System.out.println("\nBank Account System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    scanner.nextLine(); // consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    BankAccount account = manager.createAccount(name, balance);
                    System.out.println("Account created successfully!");
                    System.out.println("Your account number: " + account.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    long accNumDeposit = scanner.nextLong();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    manager.deposit(accNumDeposit, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    long accNumWithdraw = scanner.nextLong();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    manager.withdraw(accNumWithdraw, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    long accNumBalance = scanner.nextLong();
                    manager.checkBalance(accNumBalance);
                    break;
                case 5:
                    System.out.print("Enter source account number: ");
                    long sourceAcc = scanner.nextLong();
                    System.out.print("Enter destination account number: ");
                    long destAcc = scanner.nextLong();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    manager.transferFunds(sourceAcc, destAcc, transferAmount);
                    break;
                case 6:
                    System.out.println("Exiting bank system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
