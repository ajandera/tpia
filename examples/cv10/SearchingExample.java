package cv10;

import java.util.Arrays;

public class SearchingExample {
    public static void main(String[] args) {
        // Linear search in an array
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int target = 4;
        int index = linearSearch(numbers, target);

        System.out.println("Linear search result:");
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        // Binary search in a sorted array
        Arrays.sort(numbers);
        target = 5;
        index = Arrays.binarySearch(numbers, target);

        System.out.println("Binary search result:");
        if (index >= 0) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    // Linear search function
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}

