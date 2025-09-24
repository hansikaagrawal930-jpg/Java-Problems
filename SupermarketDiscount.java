import java.util.Scanner;

public class SupermarketDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input prices of items
        System.out.println("Enter prices of items:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        double totalBill = 0;

        // Calculate total bill with discount
        for (int price : prices) {
            if (price >= 500) {
                totalBill += price * 0.8; // 20% discount
            } else if (price >= 200) {
                totalBill += price * 0.9; // 10% discount
            } else {
                totalBill += price; // No discount
            }
        }

        System.out.println("Total Bill after discount = " + (int)totalBill);

        sc.close();
    }
}
