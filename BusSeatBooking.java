import java.util.Scanner;

public class BusSeatBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats in the bus: ");
        int N = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] seats = new String[N]; // Array to store seat bookings

        // Initially all seats are "Empty"
        for (int i = 0; i < N; i++) {
            seats[i] = "Empty";
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Bus Seat Booking Menu =====");
            System.out.println("1. View all seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // View all seats
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < N; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + seats[i]);
                    }
                    break;

                case 2: // Book a seat
                    System.out.print("Enter seat number to book (1-" + N + "): ");
                    int bookSeat = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (bookSeat < 1 || bookSeat > N) {
                        System.out.println("Invalid seat number!");
                        break;
                    }

                    if (!seats[bookSeat - 1].equals("Empty")) {
                        System.out.println("Seat already booked by " + seats[bookSeat - 1] + "!");
                    } else {
                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();
                        seats[bookSeat - 1] = name;
                        System.out.println("Seat " + bookSeat + " successfully booked for " + name + "!");
                    }
                    break;

                case 3: // Cancel a booking
                    System.out.print("Enter seat number to cancel (1-" + N + "): ");
                    int cancelSeat = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (cancelSeat < 1 || cancelSeat > N) {
                        System.out.println("Invalid seat number!");
                        break;
                    }

                    if (seats[cancelSeat - 1].equals("Empty")) {
                        System.out.println("Seat " + cancelSeat + " is already empty!");
                    } else {
                        System.out.println("Booking for seat " + cancelSeat + " canceled successfully.");
                        seats[cancelSeat - 1] = "Empty";
                    }
                    break;

                case 4: // Exit
                    exit = true;
                    System.out.println("Exiting booking system.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
