package examples.cv3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // load Validator
        InputValidator validator = new InputValidator();
        CheckNumber cn = new CheckNumber();

        // define the array to store data
        int[] array = new int[6];
        int x;
        int j = 0;
        for (int i = 0; i <= 5; i++) {
            do {
                x = validator.readInput(i);
                array[i] = x;
                j++;
            } while (j < i);
        }

        cn.checkNumber(array);
    }


}

class InputValidator {
    // load scanner
    static Scanner scan = new Scanner(System.in);
    public int readInput(int i) {
        System.out.print("Insert " + i + " number to array: ");
        while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            // this is important!
            scan.next();
        }
        return scan.nextInt();
    }
}

class CheckNumber {
    // loop for check numbers
    public static void checkNumber(int[] array) {
        for (int j : array) {
            if (j > 0) {
                System.out.println("Kladné číslo");
            } else if (j < 0) {
                System.out.println("Záporné číslo");
            } else {
                System.out.println("Nula");
            }
        }
    }
}
