package examples.homework1;
        import java.util.Scanner;
        import java.util.Random;
public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 20;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        int userGuess = 0;

        System.out.println("Mám na mysli číslo medzi  " + lowerBound + " a " + upperBound);

        while (userGuess != numberToGuess) {
            System.out.print("Zadajte svoj odhad: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Skúste vyššie číslo..");
            } else if (userGuess > numberToGuess) {
                System.out.println("Skúste nižšie číslo.");
            } else {
                System.out.println("Gratulujem! Číslo ste uhádli na  " + numberOfTries + " pokusov !");
            }
        }

        scanner.close();
    }

}
