//Q. Bank Account System with Interest Calculation
import java.util.Scanner;
class Account {
    String accHolderName;
    long accNumber;
    void getAccountDetails() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        accHolderName=obj.nextLine();
        System.out.print("Enter Account Number: ");
        accNumber=obj.nextLong();
    }
    void displayAccountDetails() {
        System.out.println("Account Holder: "+accHolderName);
        System.out.println("Account Number: "+accNumber);
    }
}
class SavingsAccount extends Account{
    double balance, interest;
    void getBalance(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Balance: ");
        balance=obj.nextDouble();
    }
    void calculateInterest() {
        interest=balance * 0.05;
        System.out.println("Interest Earned: "+interest);
        System.out.println("Total Balance: "+(balance + interest));
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.getAccountDetails();
        acc.getBalance();
        acc.displayAccountDetails();
        acc.calculateInterest();
    }
}