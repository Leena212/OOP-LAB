//Q.Fitness Tracking System
import java.util.Scanner;
class FitnessDevice {
    String deviceName;
    FitnessDevice() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter device name: ");
        deviceName=obj.nextLine();
    }
}
class Wearable extends FitnessDevice {
    boolean waterproof;
    Wearable() {
        super();
        Scanner obj=new Scanner(System.in);
        System.out.print("Is it waterproof? (true/false): ");
        waterproof=obj.nextBoolean();
    }
}
class GymEquipment extends FitnessDevice {
    int weightCapacity;
    GymEquipment() {
        super();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter weight capacity (kg): ");
        weightCapacity=obj.nextInt();
    }
}
class SmartBand extends Wearable {
    String healthMetrics;
    SmartBand() {
        super();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter health metrics tracked: ");
        healthMetrics=obj.nextLine();
    }
}
public class FitnessSystem {
    public static void main(String[] args) {
        SmartBand band=new SmartBand();
        GymEquipment treadmill=new GymEquipment();
    }
}