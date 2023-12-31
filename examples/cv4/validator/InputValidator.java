package examples.cv4.validator;

import java.util.Scanner;

public class InputValidator {
    // load scanner
    static Scanner scan = new Scanner(System.in);

    public int readInput(int i) {
        System.out.print("Insert " + (i + 1) + " number to array: ");
        while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            // this is important!
            scan.next();
        }
        return scan.nextInt();
    }

    public int readSizeInput() {
        System.out.print("Insert number of items in array: ");
        while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            // this is important!
            scan.next();
        }
        return scan.nextInt();
    }
}
