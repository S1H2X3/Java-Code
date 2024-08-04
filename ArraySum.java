import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for array size
        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();

        // Initialize the array]\
        int[] arr = new int[size];

        // Input for array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Display the array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Output the sum of elements in the array
        System.out.println("Sum of elements in the array: " + sum);

        scanner.close();
    }
}
