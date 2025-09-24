import java.util.Scanner;

public class VehicleToll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bus/Truck): ");
        String vehicle = sc.nextLine();

        System.out.print("Enter number of axles: ");
        int axles = sc.nextInt();

        int toll = 0;

        if (vehicle.equalsIgnoreCase("Car")) {
            toll = 100;
        } else if (vehicle.equalsIgnoreCase("Bus")) {
            toll = 200;
        } else if (vehicle.equalsIgnoreCase("Truck")) {
            toll = 300;
        } else {
            System.out.println("Invalid vehicle type");
            sc.close();
            return;
        }

        if (axles > 3) {
            toll += 50;
        }

        System.out.println("Toll Charge: " + toll);

        sc.close();
    }
}
