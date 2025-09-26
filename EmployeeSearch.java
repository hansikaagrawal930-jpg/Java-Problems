

import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee IDs
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int[] employeeIDs = new int[n];

        System.out.println("Enter employee IDs in the order they joined:");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = sc.nextInt();
        }

      
        System.out.print("Enter the employee ID to search: ");
        int targetID = sc.nextInt();

        // Perform linear search
        int position = -1; // default - not found
        for (int i = 0; i < employeeIDs.length; i++) {
            if (employeeIDs[i] == targetID) {
                position = i;
                break;
            }
        }

      
        if (position != -1) {
            System.out.println("Employee ID " + targetID + " found at position " + position);
        } else {
            System.out.println("Employee ID " + targetID + " not found");
        }

        sc.close();
    }
}
