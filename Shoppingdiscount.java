import java.util.Scanner;

public class Shoppingdiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shopping amount: ");
        double amount = sc.nextDouble();

        if (amount >= 5000) {
            System.out.println("Final Amount after 20% discount: " + (amount * 0.8));
        } else if (amount >= 2000) {
            System.out.println("Final Amount after 10% discount: " + (amount * 0.9));
        } else {
            System.out.println("No Discount. Final Amount: " + amount);
        }

        sc.close();
    }
}
