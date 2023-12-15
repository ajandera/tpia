package homeworks.filip_timko_final;
//Defining
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BingoGenerator {

    public static void main(String[] args) {
        playBingo();
    }

    public static void playBingo() {
        // Prompt user to enter the length of the array
        System.out.println("Please enter the number of elements in the array:");

        // Create an object of the InputValidation class to handle user input validation
        InputValidation validator = new InputValidation();

        // Read the user's input and store it in the variable 'arrayLength'
        int arrayLength = validator.readIt();

        // Create an array of integers with the specified length
        Integer[] array = new Integer[arrayLength];

        // Create a random object to generate random numbers
        Random random = new Random();

        // Create an array of the specified length and fill it with random numbers
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100); // Random number between 1 and 100
        }

        // Print the unsorted array
        System.out.println("The original array is:");
        System.out.println(Arrays.toString(array));

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(array));

        // Call the afterRun() method to check if the user wants to play again
        afterRun();
    }

    private static void afterRun() {
        // Ask the user if they want to play again
        System.out.println("Do you want to play again? Enter yes or no:");

        // Create a scanner object to read the user's input
        Scanner scanner = new Scanner(System.in);

        // Read the user's response and store it in the variable 'playAgain'
        String playAgain = scanner.next();

        // Close the scanner object to avoid memory leak
        scanner.close();

        // Check the user's response
        if (playAgain.equalsIgnoreCase("yes")) {
            // If the user wants to play again, call the playBingo() method
            playBingo();
        } else if (playAgain.equalsIgnoreCase("no")) {
            // If the user don´t wants to play again, it will print Goodbye
            System.out.println("Thanks for playing! Goodbye.");
        } else {
            System.out.println("Thanks for playing! Goodbye.");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // clear the resources if needed
            System.gc();
        } finally {
            super.finalize();
        }
    }
}