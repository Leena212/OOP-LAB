import java.util.Scanner;
class Person {
    private double weight;
    private double height;
    public void setWeight(double weight) { this.weight = weight; }
    public void setHeight(double height) { this.height = height; }
    public double calculateBMI() { return weight / (height * height); }
    public String getBMICategory() {
        double bmi = calculateBMI();
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal";
        else if(bmi < 30) return "Overweight";
        else return "Obese";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter weight (kg): ");
        person.setWeight(obj.nextDouble());
        System.out.print("Enter height (m): ");
        person.setHeight(obj.nextDouble());
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("Category: " + person.getBMICategory());
    }
}