package examples.cv10;

public class ArraysExample {
    public static void main(String[] args) {
        // Declaration and initialization of an array
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Iterating through the array
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

