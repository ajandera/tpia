package examples.homework1.filip_timko;


import java.util.Random;
import java.util.Scanner;


public class filip_timko {


    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        InputValidator validator = new InputValidator();
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int playerGuess = 0;
        int tries = 0;

        while (playerGuess != numberToGuess) {
            System.out.println("Guess the number between 1 and 100:");

            playerGuess = validator.readInput();
            tries++;

            if (playerGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + tries + " tries.");
        afterRun();
    }

    private static void afterRun() {
        System.out.println("Do you want to play again? Enter yes or no:");
        Scanner scanner = new Scanner(System.in);
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("yes")) {
            playGame();
        } else if(playAgain.equalsIgnoreCase("no")){
            System.out.println("Thanks for playing! Goodbye.");
        } else {
            System.out.println("You don´t know how to write... -_-");
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















