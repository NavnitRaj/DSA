package dsa.algorithm;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Nothing to sort
        }

        // Find the maximum value in the array
        int maxValue = Arrays.stream(array).max().orElse(0);

        // Create a count array to store the count of each element
        int[] count = new int[maxValue + 1];

        // Count the occurrences of each element in the input array
        for (int value : array) {
            count[value]++;
        }

        // Modify count[i] so that count[i] contains the actual position of this digit in the output[]
        for (int i = 1; i <= maxValue; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int n = array.length;
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the output array to the original array
        System.arraycopy(output, 0, array, 0, n);
    }
}
