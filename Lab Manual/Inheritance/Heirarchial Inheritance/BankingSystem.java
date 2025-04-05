//Q.BankAccountSystem
import java.util.Scanner;
class BankAccount {
    String accHolder;
    double balance;
    void getAccountDetails() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        accHolder=obj.nextLine();
        System.out.print("Enter balance: ");
        balance=obj.nextDouble();
    }
}
class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Savings Interest: "+(balance*0.05));
    }
}
class CurrentAccount extends BankAccount {
    void calculateMinimumBalance() {
        System.out.println("Minimum Balance: "+(balance*0.1));
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount();
        CurrentAccount ca=new CurrentAccount();
        System.out.println("Savings Account:");
        sa.getAccountDetails();
        sa.calculateInterest();
        System.out.println("Current Account:");
        ca.getAccountDetails();
        ca.calculateMinimumBalance();
    }
}