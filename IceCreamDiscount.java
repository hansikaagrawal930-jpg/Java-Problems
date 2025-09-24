import java.util.Scanner;

public class IceCreamDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input flavor
        System.out.print("Enter the ice cream flavor (V=Vanilla, C=Chocolate, S=Strawberry, M=Mango): ");
        String flavor = sc.next();

        // Input price
        System.out.print("Enter the price of ice cream: ");
        double price = sc.nextDouble();

        double discount = 0.0;

        // Applying discount based on flavor
        if (flavor.equalsIgnoreCase("V")) {
            discount = 0.10;   // 10%
        } else if (flavor.equalsIgnoreCase("C")) {
            discount = 0.15;   // 15%
        } else if (flavor.equalsIgnoreCase("S")) {
            discount = 0.20;   // 20%
        } else if (flavor.equalsIgnoreCase("M")) {
            discount = 0.05;   // 5%
        } else {
            discount = 0.0;    // No discount
        }

        // Calculate final price
        double discountAmount = price * discount;
        double finalPrice = price - discountAmount;

        // Output result
        System.out.println("Original Price: Rs." + price);
        System.out.println("Discount Applied: Rs." + discountAmount);
        System.out.println("Final Price to Pay: Rs." + finalPrice);

        sc.close();
    }
}
