import java.util.Scanner;

public class ElectricityBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Area (Rural/Urban): ");
        String area = sc.nextLine();

        System.out.print("Enter Units consumed: ");
        int units = sc.nextInt();

        // Check Subsidy eligibility
        if (area.equalsIgnoreCase("Rural") && units < 100) {
            System.out.println("Customer is eligible for Subsidy.");
        } else {
            System.out.println("Customer is NOT eligible for Subsidy.");
        }

        // Check Surcharge condition
        if (area.equalsIgnoreCase("Urban") || units > 500) {
            System.out.println("Customer has to pay SURCHARGE.");
        } else {
            System.out.println("No Surcharge.");
        }

        sc.close();
    }
}
