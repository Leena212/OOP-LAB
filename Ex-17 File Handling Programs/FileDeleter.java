import java.io.File;
import java.util.Scanner;

public class FileDeleter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to delete:");
        String filePath = sc.nextLine();
        
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Error: File not found or could not be deleted!");
        }
    }
}