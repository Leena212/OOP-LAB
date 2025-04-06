import java.io.File;
import java.util.Scanner;

public class FileChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to check:");
        String filePath = sc.nextLine();
        
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File exists!");
            System.out.println("Size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist!");
        }
    }
}