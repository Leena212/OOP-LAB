
package bank.simulation.core;

import java.util.HashMap;

public class AccountManager {
    private HashMap<Long, BankAccount> accounts;

    public AccountManager() {
        accounts = new HashMap<>();
    }

    public BankAccount createAccount(String name, double initialBalance) {
        BankAccount account = new BankAccount(name, initialBalance);
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    public void deposit(long accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        account.deposit(amount);
        System.out.printf("Deposited %.2f to account %d. New balance: %.2f\n", 
                         amount, accountNumber, account.getBalance());
    }

    public void withdraw(long accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        try {
            account.withdraw(amount);
            System.out.printf("Withdrew %.2f from account %d. New balance: %.2f\n", 
                            amount, accountNumber, account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void checkBalance(long accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }
        System.out.println(account);
    }

    public void transferFunds(long sourceAccount, long destAccount, double amount) {
        BankAccount src = accounts.get(sourceAccount);
        BankAccount dest = accounts.get(destAccount);
        
        if (src == null || dest == null) {
            System.out.println("One or both accounts not found!");
            return;
        }
        
        try {
            src.withdraw(amount);
            dest.deposit(amount);
            System.out.printf("Transferred %.2f from account %d to account %d\n", 
                            amount, sourceAccount, destAccount);
            System.out.printf("Source account balance: %.2f\n", src.getBalance());
            System.out.printf("Destination account balance: %.2f\n", dest.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}