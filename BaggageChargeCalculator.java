import java.util.Scanner;

public class BaggageChargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Travel Class (Economy/Business): ");
        String travelClass = sc.nextLine();

        System.out.print("Enter Passenger Type (Student/Senior Citizen/Normal): ");
        String passengerType = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Baggage Weight (kg): ");
        int baggageWeight = sc.nextInt();

        int freeAllowance = 0;

        // Travel Class allowance
        if (travelClass.equalsIgnoreCase("Economy")) {
            freeAllowance = 20;
        } else if (travelClass.equalsIgnoreCase("Business")) {
            freeAllowance = 30;
        }

        // Passenger Type allowance
        if (passengerType.equalsIgnoreCase("Student")) {
            freeAllowance += 10;
        } else if (passengerType.equalsIgnoreCase("Senior Citizen")) {
            if (age >= 60) {
                freeAllowance += 5;
            }
        }

        // Calculate excess baggage
        int excessWeight = baggageWeight - freeAllowance;
        int baggageCharge = 0;

        if (excessWeight > 0) {
            baggageCharge = excessWeight * 500;
        }

        System.out.println("Baggage Charge = ₹" + baggageCharge);
        sc.close();
    }
}
