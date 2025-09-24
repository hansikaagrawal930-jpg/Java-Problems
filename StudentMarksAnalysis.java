import java.util.Scanner;

public class StudentMarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Initialize variables
        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;
        int failedCount = 0;

        // Process marks
        for (int mark : marks) {
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
            sum += mark;
            if (mark < 40) failedCount++;
        }

        double average = (double) sum / n;

        // Output results
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        System.out.println("Average = " + average);
        System.out.println("Failed Students = " + failedCount);

        sc.close();
    }
}
