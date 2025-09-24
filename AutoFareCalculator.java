import java.util.Scanner;

public class AutoFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance
        System.out.print("Enter distance traveled (in km): ");
        double distance = sc.nextDouble();

        double fare = 0;

        // Fare calculation based on given conditions
        if (distance <= 2) {
            fare = 30; // Minimum charge
        } else if (distance <= 5) {
            fare = 50;
        } else if (distance <= 10) {
            fare = 80;
        } else {
            fare = 100 + (distance - 10) * 10; // Extra charge for every km beyond 10
        }

        System.out.println("Fare: ₹" + (int)fare);

        sc.close();
    }
}
