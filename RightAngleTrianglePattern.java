import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Stars in each row
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }

        sc.close();
    }
}
