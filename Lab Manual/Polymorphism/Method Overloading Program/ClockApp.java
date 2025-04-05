//Q.Alarm Clock
import java.util.Scanner;
class AlarmClock {
    Scanner obj=new Scanner(System.in);
    void setAlarm() {
        System.out.print("Enter hour: ");
        int hour=obj.nextInt();
        System.out.println("Alarm set for "+hour+":00");
    }
    void setAlarm(int hour) {
        System.out.print("Enter minutes: ");
        int minute=obj.nextInt();
        System.out.println("Alarm set for "+hour+":"+minute);
    }
    void setAlarm(int hour,int minute) {
        obj.nextLine(); // Clear buffer
        System.out.print("Enter sound: ");
        String sound=obj.nextLine();
        System.out.println("Alarm set for "+hour+":"+minute+" with "+sound+" sound");
    }
}
public class ClockApp {
    public static void main(String[] args) {
        AlarmClock myClock=new AlarmClock();
        myClock.setAlarm();
        myClock.setAlarm(7);
        myClock.setAlarm(7,30);
    }
}