import java.util.Scanner;

public class HotelRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to Hotel Restaurant =====");
        System.out.println("Menu:");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Desserts");

        System.out.print("Enter your choice (1-3): ");
        int categoryChoice = sc.nextInt();

        int itemChoice = 0;
        int quantity = 0;
        int price = 0;

        switch (categoryChoice) {
            case 1: // Starters
                System.out.println("Starters Menu:");
                System.out.println("1. Spring Rolls - ₹120");
                System.out.println("2. Garlic Bread - ₹100");
                System.out.print("Enter your choice: ");
                itemChoice = sc.nextInt();

                if (itemChoice == 1) price = 120;
                else if (itemChoice == 2) price = 100;
                else {
                    System.out.println("Invalid Item Choice!");
                    sc.close();
                    return;
                }
                break;

            case 2: // Main Course
                System.out.println("Main Course Menu:");
                System.out.println("1. Paneer Butter Masala - ₹200");
                System.out.println("2. Veg Biryani - ₹180");
                System.out.print("Enter your choice: ");
                itemChoice = sc.nextInt();

                if (itemChoice == 1) price = 200;
                else if (itemChoice == 2) price = 180;
                else {
                    System.out.println("Invalid Item Choice!");
                    sc.close();
                    return;
                }
                break;

            case 3: // Desserts
                System.out.println("Desserts Menu:");
                System.out.println("1. Gulab Jamun - ₹80");
                System.out.println("2. Ice Cream - ₹90");
                System.out.print("Enter your choice: ");
                itemChoice = sc.nextInt();

                if (itemChoice == 1) price = 80;
                else if (itemChoice == 2) price = 90;
                else {
                    System.out.println("Invalid Item Choice!");
                    sc.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid Category Choice!");
                sc.close();
                return;
        }

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        int totalBill = price * quantity;

        System.out.println("================================");
        System.out.println("Thank you for your order!");
        System.out.println("Your Total Bill: ₹" + totalBill);
        System.out.println("================================");

        sc.close();
    }
}
