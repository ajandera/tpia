package examples.cv1;
import java.util.Scanner;

/*

 */
public class Example2 {
        /**
         * Main class of calculator
         * @param args
         */
        public static void main(String[] args) {

            /*
             * This reads the input provided by user keyboard for a and b side
             */
            Scanner scan = new Scanner(System.in);

            // header of application
            System.out.println("Area calculator");
            System.out.println("---------------");

            // Tell user to write side a length
            System.out.print("Insert length of side a (m): ");

            // This method reads the number provided using keyboard
            int sideA = scan.nextInt();

            // Tell user to write side b length
            System.out.print("Insert length of side b (m): ");

            // This method reads the number provided using keyboard
            int sideB = scan.nextInt();

            // Closing Scanner after the use123
            scan.close();

            // calculate area dimension
            int result = sideA*sideB;

            // Displaying the number
            System.out.println("The area have "+result+" m2");
        }
}
