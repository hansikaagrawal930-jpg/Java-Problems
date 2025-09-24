import java.util.Scanner;

public class RailwayStationDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1 → Train Timings");
        System.out.println("2 → Train Fare Details");
        System.out.println("3 → Seat Availability");
        System.out.println("4 → Platform Number");
        System.out.println("5 → Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Train Timings: Train departs at 10:30 AM and arrives at 5:00 PM.");
                break;

            case 2:
                System.out.println("Train Fare Details: Standard fare is ₹500 for AC and ₹300 for Sleeper.");
                break;

            case 3:
                System.out.println("Seat Availability: 50 seats available.");
                break;

            case 4:
                System.out.println("Platform Number: Train will arrive at Platform 3.");
                break;

            case 5:
                System.out.println("Thank you! Have a safe journey.");
                break;

            default:
                System.out.println("Invalid choice. Please select between 1 to 5.");
        }

        scanner.close();
    }
}
