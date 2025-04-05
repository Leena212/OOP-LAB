import java.util.Scanner;          
import java.util.ArrayList;        
import java.lang.Math;            

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        
        System.out.println("Scientific Calculator");
        System.out.println("--------------------");
        
        while (true) {
            System.out.println("\nOperations:");
            System.out.println("1. Add\t2. Subtract\t3. Multiply\t4. Divide");
            System.out.println("5. Power\t6. Square Root\t7. Sin\t8. Cos\t9. Tan");
            System.out.println("10. View History\t0. Exit");
            System.out.print("Choose operation: ");
            
            int choice = scanner.nextInt();
            if (choice == 0) break;
            
            double result = 0;
            String operation = "";
            
            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    double a1 = scanner.nextDouble();
                    double b1 = scanner.nextDouble();
                    result = a1 + b1;
                    operation = a1 + " + " + b1 + " = " + result;
                    break;
                    
                case 2:
                    System.out.print("Enter two numbers: ");
                    double a2 = scanner.nextDouble();
                    double b2 = scanner.nextDouble();
                    result = a2 - b2;
                    operation = a2 + " - " + b2 + " = " + result;
                    break;
                    
                case 3:
                    System.out.print("Enter two numbers: ");
                    double a3 = scanner.nextDouble();
                    double b3 = scanner.nextDouble();
                    result = a3 * b3;
                    operation = a3 + " * " + b3 + " = " + result;
                    break;
                    
                case 4:
                    System.out.print("Enter two numbers: ");
                    double a4 = scanner.nextDouble();
                    double b4 = scanner.nextDouble();
                    if (b4 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    result = a4 / b4;
                    operation = a4 + " / " + b4 + " = " + result;
                    break;
                    
                case 5:
                    System.out.print("Enter base and exponent: ");
                    double base = scanner.nextDouble();
                    double exp = scanner.nextDouble();
                    result = Math.pow(base, exp);
                    operation = base + " ^ " + exp + " = " + result;
                    break;
                    
                case 6:
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    if (num < 0) {
                        System.out.println("Error: Square root of negative number!");
                        continue;
                    }
                    result = Math.sqrt(num);
                    operation = "√" + num + " = " + result;
                    break;
                    
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    double angleSin = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angleSin));
                    operation = "sin(" + angleSin + "°) = " + result;
                    break;
                    
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    double angleCos = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angleCos));
                    operation = "cos(" + angleCos + "°) = " + result;
                    break;
                    
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    double angleTan = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angleTan));
                    operation = "tan(" + angleTan + "°) = " + result;
                    break;
                    
                case 10:
                    System.out.println("\nCalculation History:");
                    for (String item : history) {
                        System.out.println(item);
                    }
                    continue;
                    
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            
            System.out.println("Result: " + result);
            history.add(operation);
        }
        
        scanner.close();
    }
}