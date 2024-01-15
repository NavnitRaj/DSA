package dsa.algorithm;

import java.util.Comparator;

public class QuickSort {
    public static <T> void quickSort(T[] array, Comparator<T> comparator) {
        quickSort(array, 0, array.length - 1, comparator);
    }

    private static <T> void quickSort(T[] array, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int partitionIndex = partition(array, low, high, comparator);

            // Recursively sort elements before and after the partition
            quickSort(array, low, partitionIndex - 1, comparator);
            quickSort(array, partitionIndex + 1, high, comparator);
        }
    }

    private static <T> int partition(T[] array, int low, int high, Comparator<T> comparator) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) <= 0) {
                i++;

                // Swap array[i] and array[j]
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
