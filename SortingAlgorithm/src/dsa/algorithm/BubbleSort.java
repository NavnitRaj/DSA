package dsa.algorithm;

import java.util.Comparator;

public class BubbleSort {
    public static <T> void bubbleSort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    // Swap elements if they are in the wrong order
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
