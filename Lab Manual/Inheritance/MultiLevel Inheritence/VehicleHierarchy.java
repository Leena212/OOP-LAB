//Q.Vehicle Hierarchy(Car-SportsCar-ElectricSportsCar
import java.util.Scanner;
class Vehicle {
    String type;
    void getType() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Vehicle Type: ");
        type = obj.nextLine();
    }
    void displayType() {
        System.out.println("Vehicle Type: " + type);
    }
}
class Car extends Vehicle {
    String model;
    void getModel() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Car Model: ");
        model = obj.nextLine();
    }
    void displayModel() {
        System.out.println("Car Model: " + model);
    }
}
class SportsCar extends Car {
    int topSpeed;
    void getTopSpeed() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Top Speed (mph): ");
        topSpeed = obj.nextInt();
    }
    void displayTopSpeed() {
        System.out.println("Top Speed: " + topSpeed + " mph");
    }
}
public class VehicleHierarchy {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.getType();
        car.getModel();
        car.getTopSpeed();
        car.displayType();
        car.displayModel();
        car.displayTopSpeed();
    }
}