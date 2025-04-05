//Q.University Grading System
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    void getStudentDetails() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter student name: ");
        name=obj.nextLine();
        System.out.print("Enter roll number: ");
        rollNo=obj.nextInt();
    }
}
class ScienceStudent extends Student {
    int physicsMarks,chemistryMarks;
    void getScienceMarks() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        physicsMarks=obj.nextInt();
        System.out.print("Enter Chemistry marks: ");
        chemistryMarks=obj.nextInt();
    }
    void displayScienceAverage() {
        System.out.println("Science Average: "+((physicsMarks+chemistryMarks)/2.0));
    }
}
class ArtsStudent extends Student {
    int historyMarks,economicsMarks;
    void getArtsMarks() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter History marks: ");
        historyMarks=obj.nextInt();
        System.out.print("Enter Economics marks: ");
        economicsMarks=obj.nextInt();
    }
    void displayArtsAverage() {
        System.out.println("Arts Average: "+((historyMarks+economicsMarks)/2.0));
    }
}
public class GradingSystem {
    public static void main(String[] args) {
        ScienceStudent sci=new ScienceStudent();
        ArtsStudent art=new ArtsStudent();
        System.out.println("Science Student:");
        sci.getStudentDetails();
        sci.getScienceMarks();
        sci.displayScienceAverage();
        System.out.println("Arts Student:");
        art.getStudentDetails();
        art.getArtsMarks();
        art.displayArtsAverage();
    }
}