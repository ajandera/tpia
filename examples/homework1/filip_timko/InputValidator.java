package examples.homework1.filip_timko;

import java.util.Scanner;
public class InputValidator {
    static Scanner scan = new Scanner(System.in);
    public int readInput() {

        while (!scan.hasNextInt()) { // Validating the input
            System.out.println("That's not a valid number! Try again:");
            scan.next(); // Discard input
        }
        return scan.nextInt();
    }
}
