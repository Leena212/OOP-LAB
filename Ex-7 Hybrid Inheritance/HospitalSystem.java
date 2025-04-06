//Q.Hospital Managment System
import java.util.Scanner;
class HospitalStaff {
    String staffId;
    HospitalStaff() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter staff ID: ");
        staffId=obj.nextLine();
    }
}
class Doctor extends HospitalStaff {
    String specialization;
    Doctor() {
        super();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter specialization: ");
        specialization=obj.nextLine();
    }
}
class Nurse extends HospitalStaff {
    String shift;
    Nurse() {
        super();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter shift (day/night): ");
        shift=obj.nextLine();
    }
}
class Surgeon extends Doctor {
    String surgeryType;
    Surgeon() {
        super();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter surgery type: ");
        surgeryType=obj.nextLine();
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Surgeon s1=new Surgeon();
        Nurse n1=new Nurse();
    }
}