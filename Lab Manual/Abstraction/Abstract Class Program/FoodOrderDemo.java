import java.util.Scanner;

abstract class FoodItem {
    protected String name;
    protected double price;
    
    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    abstract void prepare();
    abstract void displayDetails();
}

class Pizza extends FoodItem {
    private String size;
    private String[] toppings;
    
    Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }
    
    void prepare() {
        System.out.println("Preparing " + size + " pizza with " + toppings.length + " toppings");
    }
    
    void displayDetails() {
        System.out.println("Pizza Details:");
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
        System.out.print("Toppings: ");
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
    }
}

class Burger extends FoodItem {
    private boolean hasCheese;
    private boolean hasFries;
    
    Burger(String name, double price, boolean hasCheese, boolean hasFries) {
        super(name, price);
        this.hasCheese = hasCheese;
        this.hasFries = hasFries;
    }
    
    void prepare() {
        System.out.println("Preparing burger" + (hasCheese ? " with cheese" : "") + 
                          (hasFries ? " with fries" : ""));
    }
    
    void displayDetails() {
        System.out.println("Burger Details:");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Has Cheese: " + (hasCheese ? "Yes" : "No"));
        System.out.println("Includes Fries: " + (hasFries ? "Yes" : "No"));
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter food type (pizza/burger):");
        String type = sc.next();
        
        System.out.println("Enter item name:");
        String name = sc.next();
        
        System.out.println("Enter price:");
        double price = sc.nextDouble();
        
        FoodItem item;
        
        if (type.equalsIgnoreCase("pizza")) {
            System.out.println("Enter size (small/medium/large):");
            String size = sc.next();
            
            System.out.println("Enter number of toppings:");
            int numToppings = sc.nextInt();
            String[] toppings = new String[numToppings];
            
            for (int i = 0; i < numToppings; i++) {
                System.out.println("Enter topping " + (i+1) + ":");
                toppings[i] = sc.next();
            }
            
            item = new Pizza(name, price, size, toppings);
        } else {
            System.out.println("Include cheese? (true/false):");
            boolean cheese = sc.nextBoolean();
            System.out.println("Include fries? (true/false):");
            boolean fries = sc.nextBoolean();
            
            item = new Burger(name, price, cheese, fries);
        }
        
        item.displayDetails();
        item.prepare();
        sc.close();
    }
}