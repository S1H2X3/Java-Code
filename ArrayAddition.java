import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the dimensions of the 2D array
        System.out.println("Enter the no of sub arrays you want : ");
        int arrays = scanner.nextInt();// Number of arrays
        System.out.println("Enter the no of elements you want present in sub : ");
        int elements = scanner.nextInt();// Number of elements

        // Create the 2D array
        int[][] arr1 = new int[arrays][elements];

        // Prompt the user to enter elements for each array
        for (int i = 0; i < arrays; i++) {
            System.out.println("Enter elements for " + (i + 1) + " sub array :");
            for (int j = 0; j < elements; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < arrays; i++) {
            for (int j = 0; j < elements; j++) {
                sum += arr1[i][j];
            }
        }

        // Print the sum
        System.out.println("Sum of elements in 2D arrays is : " + sum);

        scanner.close();
    }
}
