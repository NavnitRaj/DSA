package dsa.algorithm;

import java.util.Comparator;

public class InsertionSort {
    public static <T> void insertionSort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            T key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && comparator.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
