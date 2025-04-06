import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter shape type (circle/rectangle):");
        String shapeType = sc.next();
        
        Shape shape;
        
        if (shapeType.equalsIgnoreCase("circle")) {
            System.out.println("Enter radius:");
            double radius = sc.nextDouble();
            shape = new Circle(radius);
        } else {
            System.out.println("Enter length and width:");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            shape = new Rectangle(length, width);
        }
        
        System.out.println("Area: " + shape.calculateArea());
        sc.close();
    }
}