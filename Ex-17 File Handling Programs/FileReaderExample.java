import java.io.*;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path to read:");
        String filePath = sc.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nFile Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read!");
        }
    }
}