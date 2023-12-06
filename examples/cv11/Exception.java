package cv11;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = divideNumbers(numerator, denominator);

            // Display the result
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    // Method to perform division
    private static int divideNumbers(int numerator, int denominator) {
        // Check if the denominator is zero
        if (denominator == 0) {
            // If it is, throw an ArithmeticException
            throw new ArithmeticException("Division by zero");
        }

        // Perform division and return the result
        return numerator / denominator;
    }
}
