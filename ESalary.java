// Program: Calculate Daily Salary Based on Day of Week
import java.util.Scanner;

public class ESalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input monthly salary
        System.out.print("Enter monthly salary: ");
        double monthlySalary = sc.nextDouble();

        // Input day of week
        System.out.print("Enter day of week (Monday-Sunday): ");
        String dayOfWeek = sc.next();

        // Calculate base daily salary (assuming 30 days in a month)
        double dailySalary = monthlySalary / 30;

        double finalSalary = 0;

        // Switch case to add bonus based on the day
        switch (dayOfWeek.toLowerCase()) {
            case "monday":
                finalSalary = dailySalary;
                break;
            case "tuesday":
                finalSalary = dailySalary + 10;
                break;
            case "wednesday":
                finalSalary = dailySalary;
                break;
            case "thursday":
                finalSalary = dailySalary + 5;
                break;
            case "friday":
                finalSalary = dailySalary;
                break;
            case "saturday":
                finalSalary = dailySalary + 15;
                break;
            case "sunday":
                finalSalary = 0; // Off day
                break;
            default:
                System.out.println("Invalid day entered.");
                sc.close();
                return;
        }

        // Output the result
        System.out.println("Daily salary for " + dayOfWeek + " is: $" + finalSalary);

        sc.close();
    }
}
