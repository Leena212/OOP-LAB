//Q.Employee Management System
import java.util.Scanner;
class Employee{
    String name;
    int empId;
    void getDetails() {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name=obj.nextLine();
        System.out.print("Enter Employee ID: ");
        empId=obj.nextInt();
    }
    void displayDetails() {
        System.out.println("Employee Name:"+ name);
        System.out.println("Employee ID:"+ empId);
    }
}
class Salary extends Employee{
    double basicPay, hra, da, grossSalary;
    void calculateSalary() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        basicPay=obj.nextDouble();
        hra=0.2*basicPay;
        da=0.1*basicPay;
        grossSalary=basicPay+hra+da;
    }
    void displaySalary() {
        System.out.println("Basic Pay: "+basicPay);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("Gross Salary: "+grossSalary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Salary emp = new Salary();
        emp.getDetails();
        emp.calculateSalary();
        emp.displayDetails();
        emp.displaySalary();
    }
}