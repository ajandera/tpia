package examples.cv4;

import examples.cv4.validator.InputValidator;
import examples.cv4.printer.Results;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // load Validator
        InputValidator validator = new InputValidator();
        // load printer
        Results results = new Results();

        while (true) {
            // define the array to store data
            ToDecision decisionArray = new ToDecision(6);
            int x;

            for (int i = 0; i <= 5; i++) {
                do {
                    x = validator.readInput(i);
                    decisionArray.addNumber(x, i);
                } while (x <= 0);
            }

            results.show(decisionArray.getValues());
            afterRun();
        }
    }

    private static void afterRun() {
        System.out.print("Enter a 'run' to continue or 'quit' to exit): ");
        Scanner scanner = new Scanner(System.in);
        String userInput;
        userInput = scanner.nextLine().trim();
        if (userInput.equalsIgnoreCase("quit")) {
            System.out.println("Exiting the application. Goodbye!");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // clear the resources if needed
            System.gc();
        } finally {
            super.finalize();
        }
    }
}

