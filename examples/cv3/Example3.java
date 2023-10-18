package examples.cv3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // load scanner
        Scanner scan = new Scanner(System.in);

        // define the array to store data
        int[] array = new int[6];
        int x;
        int j = 0;
        for (int i = 0; i <= 5; i++) {
            do {
                x = readInput(scan, i);
                array[i] = x;
                j++;
            } while (j<i);
        }



        checkNumber(array);
    }

    public static int readInput(Scanner scan, int i) {
        System.out.print("Insert " + i + " number to array: ");
        while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            scan.next(); // this is important!
        }
        return scan.nextInt();
    }


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