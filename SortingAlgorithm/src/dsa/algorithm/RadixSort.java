package dsa.algorithm;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(Integer[] array) {
        // Find the maximum number to determine the number of digits
        int max = Arrays.stream(array).max(Integer::compare).orElse(0);

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    private static void countingSort(Integer[] array, int exp) {
        int n = array.length;
        Integer[] output = new Integer[n];
        int[] count = new int[10];

        // Initialize count array
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (Integer value : array) {
            count[(value / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains the actual
        // position of this digit in the output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        // Copy the output array to array[], so that array[] contains sorted numbers
        System.arraycopy(output, 0, array, 0, n);
    }
}
