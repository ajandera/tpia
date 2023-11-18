package examples.homework1;
import java.util.Scanner;
import java.util.Random;
public class homework1_Barvynska {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int lowerBound = 1;
            int upperBound = 100;
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int numberOfTries = 0;
            int userGuess = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < numberToGuess) {
                    System.out.println("Try a higher number.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Try a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                }
            }

            scanner.close();
        }
    }
