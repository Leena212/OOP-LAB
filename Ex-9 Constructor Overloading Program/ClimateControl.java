//Q.Smart THermostat Control System
import java.util.Scanner;
class Thermostat {
    String deviceId;
    double currentTemp;
    double targetTemp;
    Thermostat() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter device ID: ");
        deviceId=obj.nextLine();
        System.out.print("Enter current temperature: ");
        currentTemp=obj.nextDouble();
        targetTemp=22.0;
    }
    Thermostat(String id, double temp) {
        deviceId=id;
        currentTemp=temp;
        targetTemp=22.0;
    }
    Thermostat(String id, double currTemp, double targTemp) {
        deviceId=id;
        currentTemp=currTemp;
        targetTemp=targTemp;
    }
    void adjustTemperature() {
        System.out.println("Adjusting from "+currentTemp+"°C to "+targetTemp+"°C");
    }
}
public class ClimateControl {
    public static void main(String[] args) {
        Thermostat t1=new Thermostat();
        Thermostat t2=new Thermostat("LivingRoom",25.5);
        Thermostat t3=new Thermostat("Bedroom",18.0,20.0);
        t1.adjustTemperature();
        t2.adjustTemperature();
        t3.adjustTemperature();
    }
}