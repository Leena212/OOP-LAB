import java.util.Scanner;

interface SmartDevice {
    void turnOn();
    void turnOff();
    void adjust(int level);
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
    public void adjust(int brightness) { System.out.println("Brightness set to: " + brightness); }
}

class Fan implements SmartDevice {
    public void turnOn() { System.out.println("Fan turned ON"); }
    public void turnOff() { System.out.println("Fan turned OFF"); }
    public void adjust(int speed) { System.out.println("Fan speed set to: " + speed); }
}

public class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose device (1-Light, 2-Fan): ");
        int choice = sc.nextInt();
        
        SmartDevice device;
        if (choice == 1) device = new Light();
        else device = new Fan();

        System.out.println("1-Turn On, 2-Turn Off, 3-Adjust: ");
        int action = sc.nextInt();
        
        if (action == 1) device.turnOn();
        else if (action == 2) device.turnOff();
        else {
            System.out.println("Enter adjustment level: ");
            int level = sc.nextInt();
            device.adjust(level);
        }
        sc.close();
    }
}