import java.util.Scanner;

public class Add {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate the sum of digits: ");
        int number = scan.nextInt();
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
        scan.close(); // Close the scanner to prevent resource leak
    }

    static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Extract the last digit and add it to sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
