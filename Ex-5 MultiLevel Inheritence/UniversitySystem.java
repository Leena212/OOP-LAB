//Q.University System(Person-student-researchstudent)
import java.util.Scanner;
class Person {
    String name;
    void getName() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = obj.nextLine();
    }
    void displayName() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    int rollNo;
    void getRollNo() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = obj.nextInt();
    }
    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}
class ResearchStudent extends Student {
    String thesisTopic;
    void getThesisTopic() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Thesis Topic: ");
        thesisTopic = obj.nextLine();
    }
    void displayThesisTopic() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
public class UniversitySystem {
    public static void main(String[] args) {
        ResearchStudent student = new ResearchStudent();
        student.getName();
        student.getRollNo();
        student.getThesisTopic();
        student.displayName();
        student.displayRollNo();
        student.displayThesisTopic();
    }
}