
import java.util.Scanner;

public class Gradingystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input score
        System.out.print("Enter the student's score (0 - 100): ");
        int score = sc.nextInt();

        String grade;
        String remark;

        // Checking conditions
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
            return; // exit the program
        } else if (score >= 90 && score <= 100) {
            grade = "A+";
            remark = "Excellent";
        } else if (score >= 80) {
            grade = "A";
            remark = "Very Good";
        } else if (score >= 70) {
            grade = "B";
            remark = "Good";
        } else if (score >= 60) {
            grade = "C";
            remark = "Average";
        } else if (score >= 50) {
            grade = "D";
            remark = "Below Average";
        } else {
            grade = "F";
            remark = "Fail";
        }

        // Output results
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);

        sc.close();
    }
}
