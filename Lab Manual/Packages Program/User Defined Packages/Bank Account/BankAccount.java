package bank.simulation.core;

public class BankAccount {
    private static long accountNumberCounter = 10000000L;
    
    private long accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountNumber = ++accountNumberCounter;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public long getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public String toString() {
        return String.format("Account Number: %d\nHolder: %s\nBalance: %.2f", 
                            accountNumber, accountHolder, balance);
    }
}
