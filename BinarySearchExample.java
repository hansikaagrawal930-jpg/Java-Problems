import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array (Binary search requires sorted array)
        Arrays.sort(arr);

        // Display sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Input the element to search
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // Binary search
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Element not found
    }
}
