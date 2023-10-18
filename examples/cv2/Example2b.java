package examples.cv2;

import java.util.Scanner;

public class Example2b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // array definition
        int[] array = new int[6];
        int x;
        for (int i = 0; i <= 5; i++) {
            do {
                System.out.print("Insert " + i + " number to array: ");
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number!");
                    scan.next(); // this is important!
                }
                x = scan.nextInt();
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
}
