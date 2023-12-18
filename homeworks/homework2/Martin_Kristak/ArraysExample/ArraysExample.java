package homeworks.homework2.Martin_Kristak.ArraysExample;

public class ArraysExample {
    public static void main(String[] args) {
        // Declaration and initialization of an array
        int[] numbers = {1, 2, 3, 4};

        // Accessing elements of the array
        System.out.println("First element: " + numbers[1]);
        System.out.println("Second element: " + numbers[3]);

        // Iterating through the array
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
