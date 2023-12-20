package homeworks.barvynska_zadanie;
import java.util.Scanner;
import java.util.ArrayList;

    interface ArrayProcessor {
        void processArray(int[] arr);
    }

    class EvenNumberProcessor implements ArrayProcessor {
        private ArrayList<Integer> evenNumbers;

        public EvenNumberProcessor() {
            evenNumbers = new ArrayList<>();
        }

        @Override
        public void processArray(int[] arr) {
            for (int value : arr) {
                if (value % 2 == 0) {
                    evenNumbers.add(value);
                }
            }
        }

        public ArrayList<Integer> getEvenNumbers() {
            return evenNumbers;
        }
    }

    abstract class InputValidator {
        public static boolean validateArraySize(int size) {
            return size > 0;
        }

        public static boolean validateArrayElement(int element) {
            // Add more specific validation logic if needed
            return true;
        }
    }

    public class zadanie {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continueProgram = true;

            while (continueProgram) {
                int size;
                do {
                    System.out.print("Enter the size of the array: ");
                    size = scanner.nextInt();
                } while (!InputValidator.validateArraySize(size));

                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");

                for (int i = 0; i < size; i++) {
                    int element;
                    do {
                        element = scanner.nextInt();
                    } while (!InputValidator.validateArrayElement(element));
                    arr[i] = element;
                }

                EvenNumberProcessor evenNumberProcessor = new EvenNumberProcessor();
                evenNumberProcessor.processArray(arr);


                System.out.println("The even numbers in the array are:");
                for (int evenNumber : evenNumberProcessor.getEvenNumbers()) {
                    System.out.print(evenNumber + " ");
                }
                afterRun();
            }
        }

        private static void afterRun() {
            System.out.println("Enter a 'run' to continue or 'quit' to exit): ");
            Scanner scanner = new Scanner(System.in);
            String userInput;
            userInput = scanner.nextLine().trim();
            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the application. Goodbye!");
                System.exit(0);
            }
        }
    }



