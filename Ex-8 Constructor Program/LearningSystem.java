//Q.E-Learning Platform Course Management
import java.util.Scanner;
class Course {
    String courseCode;
    int maxEnrollment;
    Course() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter course code: ");
        courseCode=obj.nextLine();
        System.out.print("Enter max enrollment: ");
        maxEnrollment=obj.nextInt();
    }
    void checkAvailability(int currentEnroll) {
        System.out.println("Available seats: "+(maxEnrollment-currentEnroll));
    }
}
public class LearningSystem {
    public static void main(String[] args) {
        Course javaCourse=new Course();
        javaCourse.checkAvailability(15);
    }
}