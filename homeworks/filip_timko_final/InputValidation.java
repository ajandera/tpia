package homeworks.filip_timko_final;

import java.util.Scanner;

public class InputValidation {

    // Create a scanner object to read input from user
    static Scanner scan = new Scanner(System.in);

    // Read the number from the user
    public int readIt() {

        while (!scan.hasNextInt()) { // Validating the input
            System.out.println("That's not a valid number! Try again:");
            scan.next(); // Discard input
        }
        return scan.nextInt();
    }
}
