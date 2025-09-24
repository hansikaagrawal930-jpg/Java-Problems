import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input traffic light color
        System.out.print("Enter traffic light color (Red/Yellow/Green): ");
        String color = sc.nextLine();

        // Switch statement
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}
