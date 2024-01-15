package dsa.algorithm;

import java.util.Comparator;

public class ShellSort {
    public static <T> void shellSort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                T temp = array[i];
                int j;

                // Shift earlier gap-sorted elements up until the correct position is found
                for (j = i; j >= gap && comparator.compare(array[j - gap], temp) > 0; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Insert the current element at its correct position
                array[j] = temp;
            }
        }
    }
}
