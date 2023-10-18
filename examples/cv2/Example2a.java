package examples.cv2;

import java.util.Scanner;

public class Example2a {
    public static void main(String[] args) {
        /*
         * This reads the input provided by user keyboard for a and b side
         */
        Scanner scan = new Scanner(System.in);

        // header of application
        System.out.println("Triangle printer");
        System.out.println("---------------");

        // Tell user to write side a length
        System.out.print("Insert length of side a (number of char): ");

        // This method reads the number provided using keyboard
        int sideA = scan.nextInt();

        // Closing Scanner after the use123
        scan.close();

        for (int i = 0; i < sideA; i++) {
            String row = "";
            for (int j = 0; j <= sideA; j++) {
                row += 'x';
            }
            System.out.println(row);
        }
    }
}
