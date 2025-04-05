import java.util.Scanner;         
import java.util.regex.Pattern;   
import java.util.regex.Matcher;    

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Password Strength Checker");
        System.out.println("------------------------");
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        int strength = 0;
        
        // Check length
        if (password.length() >= 8) strength++;
        if (password.length() >= 12) strength++;
        
        // Check for uppercase letters
        Pattern upperCase = Pattern.compile("[A-Z]");
        Matcher matcher = upperCase.matcher(password);
        if (matcher.find()) strength++;
        
        // Check for lowercase letters
        Pattern lowerCase = Pattern.compile("[a-z]");
        matcher = lowerCase.matcher(password);
        if (matcher.find()) strength++;
        
        // Check for numbers
        Pattern digit = Pattern.compile("[0-9]");
        matcher = digit.matcher(password);
        if (matcher.find()) strength++;
        
        // Check for special characters
        Pattern special = Pattern.compile("[^a-zA-Z0-9]");
        matcher = special.matcher(password);
        if (matcher.find()) strength++;
        
        System.out.println("\nPassword Analysis:");
        System.out.println("Length: " + password.length() + " characters");
        
        String strengthLevel;
        if (strength < 3) {
            strengthLevel = "Very Weak";
        } else if (strength < 5) {
            strengthLevel = "Weak";
        } else if (strength < 7) {
            strengthLevel = "Moderate";
        } else if (strength < 9) {
            strengthLevel = "Strong";
        } else {
            strengthLevel = "Very Strong";
        }
        
        System.out.println("Strength: " + strengthLevel + " (" + strength + "/10)");
        
        if (strength < 5) {
            System.out.println("\nRecommendations:");
            if (password.length() < 8) {
                System.out.println("- Make your password at least 8 characters long");
            }
            if (!upperCase.matcher(password).find()) {
                System.out.println("- Include at least one uppercase letter");
            }
            if (!digit.matcher(password).find()) {
                System.out.println("- Include at least one number");
            }
            if (!special.matcher(password).find()) {
                System.out.println("- Include at least one special character");
            }
        }
        
        scanner.close();
    }
}