package examples.cv10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        // Sorting an array
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        Arrays.sort(numbers);

        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println(); // New line for separation

        // Sorting an ArrayList
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        Collections.sort(fruits);

        System.out.println("Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

