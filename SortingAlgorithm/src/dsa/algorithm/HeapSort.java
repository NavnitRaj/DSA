package dsa.algorithm;

import java.util.Comparator;

public class HeapSort {
    public static <T> void heapSort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, comparator);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Heapify the reduced heap
            heapify(array, i, 0, comparator);
        }
    }

    private static <T> void heapify(T[] array, int n, int i, Comparator<T> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Compare with left child
        if (left < n && comparator.compare(array[left], array[largest]) > 0) {
            largest = left;
        }

        // Compare with right child
        if (right < n && comparator.compare(array[right], array[largest]) > 0) {
            largest = right;
        }

        // Swap and heapify if needed
        if (largest != i) {
            T temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest, comparator);
        }
    }
}
