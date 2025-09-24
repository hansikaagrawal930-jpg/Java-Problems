import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000; // Initial balance
        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println("Transaction Successful! Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
