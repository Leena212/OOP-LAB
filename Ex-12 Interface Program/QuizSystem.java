import java.util.Scanner;

interface QuizQuestion {
    void displayQuestion();
    boolean checkAnswer(String userAnswer);
}

class MCQ implements QuizQuestion {
    private String question;
    private String correctOption;
    
    MCQ(String q, String correct) {
        question = q;
        correctOption = correct;
    }
    
    public void displayQuestion() { System.out.println(question); }
    public boolean checkAnswer(String userAnswer) { return userAnswer.equalsIgnoreCase(correctOption); }
}

public class QuizSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizQuestion q = new MCQ("What is 2+2? (A)3 (B)4 (C)5", "B");
        
        q.displayQuestion();
        System.out.println("Your answer (A/B/C): ");
        String ans = sc.next();
        
        System.out.println(q.checkAnswer(ans) ? "Correct!" : "Wrong!");
        sc.close();
    }
}