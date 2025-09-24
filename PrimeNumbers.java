import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + N + " are:");

        for (int i = 2; i <= N; i++) { // Start from 2, as 1 is not prime
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
