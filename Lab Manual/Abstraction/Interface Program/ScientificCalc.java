import java.util.Scanner;

interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class BasicCalculator implements Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) { return (b != 0) ? a / b : Double.NaN; }
}

public class ScientificCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new BasicCalculator();
        
        System.out.println("Enter two numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        System.out.println("1-Add, 2-Subtract, 3-Multiply, 4-Divide: ");
        int op = sc.nextInt();
        
        switch(op) {
            case 1: System.out.println("Result: " + calc.add(x, y)); break;
            case 2: System.out.println("Result: " + calc.subtract(x, y)); break;
            case 3: System.out.println("Result: " + calc.multiply(x, y)); break;
            case 4: System.out.println("Result: " + calc.divide(x, y)); break;
            default: System.out.println("Invalid choice!");
        }
        sc.close();
    }
}