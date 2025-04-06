import java.util.Scanner;

abstract class ElectronicDevice {
    protected String brand;
    protected String model;
    protected double price;
    
    ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    abstract void displayFeatures();
    abstract double calculateDiscount();
}

class Smartphone extends ElectronicDevice {
    private String os;
    private int storageGB;
    
    Smartphone(String brand, String model, double price, String os, int storageGB) {
        super(brand, model, price);
        this.os = os;
        this.storageGB = storageGB;
    }
    
    void displayFeatures() {
        System.out.println("Smartphone Features:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + os);
        System.out.println("Storage: " + storageGB + "GB");
        System.out.println("Price: $" + price);
    }
    
    double calculateDiscount() {
        return price * 0.1; // 10% discount
    }
}

class Laptop extends ElectronicDevice {
    private String processor;
    private int ramGB;
    
    Laptop(String brand, String model, double price, String processor, int ramGB) {
        super(brand, model, price);
        this.processor = processor;
        this.ramGB = ramGB;
    }
    
    void displayFeatures() {
        System.out.println("Laptop Features:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + "GB");
        System.out.println("Price: $" + price);
    }
    
    double calculateDiscount() {
        return price * 0.15; // 15% discount
    }
}

public class ElectronicsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter device type (smartphone/laptop):");
        String type = sc.next();
        
        System.out.println("Enter brand:");
        String brand = sc.next();
        
        System.out.println("Enter model:");
        String model = sc.next();
        
        System.out.println("Enter price:");
        double price = sc.nextDouble();
        
        ElectronicDevice device;
        
        if (type.equalsIgnoreCase("smartphone")) {
            System.out.println("Enter OS:");
            String os = sc.next();
            System.out.println("Enter storage (GB):");
            int storage = sc.nextInt();
            device = new Smartphone(brand, model, price, os, storage);
        } else {
            System.out.println("Enter processor:");
            String processor = sc.next();
            System.out.println("Enter RAM (GB):");
            int ram = sc.nextInt();
            device = new Laptop(brand, model, price, processor, ram);
        }
        
        device.displayFeatures();
        System.out.println("Discount: $" + device.calculateDiscount());
        System.out.println("Final Price: $" + (device.price - device.calculateDiscount()));
        sc.close();
    }
}