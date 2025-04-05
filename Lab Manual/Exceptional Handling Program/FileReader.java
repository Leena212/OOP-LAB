import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter file path: ");
            String filePath = sc.nextLine();
            
            Scanner fileScanner = new Scanner(new File(filePath));
            System.out.println("File content:");
            while(fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found or cannot be read!");
        } catch (SecurityException e) {
            System.out.println("Error: No permission to access the file!");
        } finally {
            sc.close();
        }
    }
}