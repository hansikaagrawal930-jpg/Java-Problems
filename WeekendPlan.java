import java.util.Scanner;

public class WeekendPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Is Rahul free? (true/false): ");
        boolean rahulFree = sc.nextBoolean();

        System.out.print("Is Sneha free? (true/false): ");
        boolean snehaFree = sc.nextBoolean();

        System.out.print("Is Arjun free? (true/false): ");
        boolean arjunFree = sc.nextBoolean();

        // Count how many friends are free
        int freeCount = 0;
        if (rahulFree) freeCount++;
        if (snehaFree) freeCount++;
        if (arjunFree) freeCount++;

        // Decide plan based on freeCount
        if (freeCount == 3) {
            System.out.println("All three friends are free! They will go on a road trip.");
        } else if (freeCount == 2) {
            System.out.println("Two friends are free! They will go to a cricket match.");
        } else if (freeCount == 1) {
            System.out.println("Only one friend is free! They will play video games at home.");
        } else {
            System.out.println("No one is free! Everyone will sleep at home.");
        }

        sc.close();
    }
}
