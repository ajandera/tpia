package examples.cv2;

import java.util.Scanner;

public class Example2b {
    public static void main(String[] args) {
        // array definition

        Scanner scan = new Scanner(System.in);

        // header of application


        // Tell user to write side a length
        System.out.print("Insert length of array");
        System.out.println("---------------");
        int lenght = scan.nextInt();
        // This method reads the number provided using keyboard
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {

            int x;
            do {
                System.out.println("Insert the numbers to the array");
                System.out.println("---------------");
                while (!scan.hasNextInt()) {
                    System.out.println("It isn´t a number!");
                    scan.next();
                }
                x = scan.nextInt();
                array[i] = x;
            } while (x <= 0);
        }

    // loop for check numbers
        for(
    int j :array)

    {
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
