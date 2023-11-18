package examples.homework1;

import java.util.Scanner;
import java.util.Random;


public class Kristak {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("My system is thinking of a number between 1 and 100.");

        while (userGuess != randomNumber) {
            System.out.print("C'mon enter your guess if you dare: ");
            while (!scanner.hasNextInt()) { // Validate user input
                System.out.println("No,no,no... you need to enter a number. Try again.");
                scanner.next(); // Discard the non-integer input
            }
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too bad...try a higher number.");
            } else if (userGuess > randomNumber) {
                System.out.println("mmmm...no, try a lower number.");
            }
        }

        System.out.println("Wow! You guessed the number, its only takes you " + attempts + " tries.");

        System.out.print("So what now, do you want to play again? Type yes or no: ");
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("yes")) {
            playGame();
        } else {
            System.out.println("Thanks for playing! Have a nice day or night, idk. Goodbye.");
        }
    }
}
