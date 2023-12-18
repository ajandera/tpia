package homeworks.filip_timko_final;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

// Game interface that provides a method for starting the game
interface Game {
    void startGame();
}

public class BingoGenerator implements Game {

    @Override
    public void startGame() {
        boolean Continue = true; // Control the game loop
        while(Continue) {
            Player player = new Player(); // Create a new Player object
            int arrayLength = player.getArrayLength(); // Get the length of the array from the player

            RandomNumberGenerator rng = new RandomNumberGenerator(); // Create a new RandomNumberGenerator object
            int[] array = rng.generateRandomNumbers(arrayLength); // Generate an array of random numbers using the rng object

            player.showArray(array); // Display the original array to the player

            Sorter sorter = new Sorter(); // Create a new Sorter object
            int[] sortedArray = sorter.sort(array); // Sort the array using the sorter object

            player.showSortedArray(sortedArray); // Display the sorted array to the player

            Continue = player.getContinueGame(); // Check if the player wants to continue playing
        }
    }

    // Main method to start the game
    public static void main(String[] args) {
        Game game = new BingoGenerator();
        game.startGame();
    }
}

class Player {

    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    // Method to get the length of the array from the player
    public int getArrayLength() {
        int arrayLength = 0;
        while (true) {
            System.out.println("Enter the length of the array:");
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
                if (arrayLength > 0) {
                    break;
                } else {
                    System.out.println("Error: The length should be greater than zero.");
                }
            } else {
                System.out.println("Error: The length should be an integer.");
                scanner.next();
            }
        }
        return arrayLength;
    }

    // Method to display the original array to the player
    public void showArray(int[] array) {
        System.out.println("The original array is:");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    // Method to display the sorted array to the player
    public void showSortedArray(int[] sortedArray) {
        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println();
    }

    // Method to check if the player wants to continue playing
    public boolean getContinueGame() {
        System.out.println("Do you want to continue? Enter 'yes' or 'no':");
        String choice = scanner.next();
        return choice.equalsIgnoreCase("yes");
    }
}

class RandomNumberGenerator {
    Random random = new Random();
    public int[] generateRandomNumbers(int length) {
        int[] array = new int[length];

        // Create an array of the specified length and fill it with random numbers
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Random number between 1 and 100
        }
        return array;
    }
}

class Sorter {

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}