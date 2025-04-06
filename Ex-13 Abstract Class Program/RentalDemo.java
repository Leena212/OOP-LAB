import java.util.Scanner;

abstract class Vehicle {
    protected String model;
    protected String licensePlate;
    
    Vehicle(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }
    
    abstract double calculateRentalCost(int days);
    abstract void displayDetails();
}

class Car extends Vehicle {
    private int seatingCapacity;
    private double dailyRate;
    
    Car(String model, String licensePlate, int seatingCapacity, double dailyRate) {
        super(model, licensePlate);
        this.seatingCapacity = seatingCapacity;
        this.dailyRate = dailyRate;
    }
    
    double calculateRentalCost(int days) {
        return dailyRate * days;
    }
    
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Daily Rate: $" + dailyRate);
    }
}

class Bike extends Vehicle {
    private boolean hasHelmet;
    private double hourlyRate;
    
    Bike(String model, String licensePlate, boolean hasHelmet, double hourlyRate) {
        super(model, licensePlate);
        this.hasHelmet = hasHelmet;
        this.hourlyRate = hourlyRate;
    }
    
    double calculateRentalCost(int hours) {
        return hourlyRate * hours;
    }
    
    void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Includes Helmet: " + (hasHelmet ? "Yes" : "No"));
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

public class RentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter vehicle type (car/bike):");
        String type = sc.next();
        
        System.out.println("Enter model:");
        String model = sc.next();
        
        System.out.println("Enter license plate:");
        String plate = sc.next();
        
        Vehicle vehicle;
        
        if (type.equalsIgnoreCase("car")) {
            System.out.println("Enter seating capacity:");
            int capacity = sc.nextInt();
            System.out.println("Enter daily rate:");
            double rate = sc.nextDouble();
            vehicle = new Car(model, plate, capacity, rate);
            
            System.out.println("Enter rental days:");
            int days = sc.nextInt();
            System.out.println("Total cost: $" + vehicle.calculateRentalCost(days));
        } else {
            System.out.println("Does it include helmet? (true/false):");
            boolean helmet = sc.nextBoolean();
            System.out.println("Enter hourly rate:");
            double rate = sc.nextDouble();
            vehicle = new Bike(model, plate, helmet, rate);
            
            System.out.println("Enter rental hours:");
            int hours = sc.nextInt();
            System.out.println("Total cost: $" + vehicle.calculateRentalCost(hours));
        }
        
        vehicle.displayDetails();
        sc.close();
    }
}