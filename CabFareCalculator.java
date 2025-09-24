import java.util.Scanner;

public class CabFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance
        System.out.print("Enter Distance (in km): ");
        double distance = sc.nextDouble();

        double fare = 0;

        // Fare calculation using if-else
        if (distance <= 5) {
            fare = 100; // Flat rate
        } else if (distance <= 15) {
            fare = distance * 10;
        } else {
            fare = distance * 8;
        }

        System.out.println("Fare = ₹" + fare);

        sc.close();
    }
}
