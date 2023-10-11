package examples.cv2;

/**
 * Create mini app to check which number is odd and which is even.
 */
public class Example2c {
    public static void main(String[] args) {
        // array definition
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // initial variable for cycle
        int i = 0;
        do {
            // check if number is odd or even
            String type = checkOddEven(array[i]);

            //print results
            System.out.println(array[i] + type);

            //increment array element
            i++;
        } while (i < array.length); // check if we are at the end of array
    }

    /**
     * Check if the number is odd or even.
     *
     * @param number
     * @return String
     */
    public static String checkOddEven(int number) {
        // should be replaced by if/else statement, for education example use switch
        switch (number % 2) {
            case 0:
                return " - number is even.";
            default:
                return "  - number is odd.";
        }
    }
}
