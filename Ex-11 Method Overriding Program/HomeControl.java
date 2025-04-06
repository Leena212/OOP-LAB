import java.util.Scanner;
class Appliance {
    void powerOn() {
        System.out.println("Appliance turned on normally");
    }
}
class SmartAppliance extends Appliance {
    void powerOn() {
        System.out.println("Appliance turned on with voice command");
    }
}
public class HomeControl {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Use smart control? (y/n): ");
        String choice = obj.next();
        
        Appliance device = choice.equalsIgnoreCase("y") ? new SmartAppliance() : new Appliance();
        device.powerOn();
    }
}