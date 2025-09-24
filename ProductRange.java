import java.util.Scanner;

public class ProductRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Check condition
        if (M > N) {
            System.out.println("M is greater than N, returning 1.");
            System.out.println("Output: 1");
        } else {
            long product = 1; // use long to avoid overflow for large numbers
            for (int i = M; i <= N; i++) {
                product *= i;
            }
            System.out.println("Output: " + product);
        }

        sc.close();
    }
}
