package examples.cv3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // load scanner
        Scanner scan = new Scanner(System.in);

        // define the array to store data
        int[] array = new int[6];
        int x;
        for (int i = 0; i <= 5; i++) {
            do {
                x = readInput(scan, i);
                array[i] = x;
            } while (x <= 0);
        }


        // loop for check numbers
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

    public static int readInput(Scanner scan, int i) {
        System.out.print("Insert " + i + " number to array: ");
        while (!scan.hasNextInt()) {
            System.out.println("That's not a number!");
            scan.next(); // this is important!
        }
        return scan.nextInt();
    }
}
