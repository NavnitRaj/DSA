package dsa.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {
    public static <T> void mergeSort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        if (n > 1) {
            int mid = n / 2;

            // Split array into two halves
            T[] leftArray = Arrays.copyOfRange(array, 0, mid);
            T[] rightArray = Arrays.copyOfRange(array, mid, n);

            // Recursive calls to sort the two halves
            mergeSort(leftArray, comparator);
            mergeSort(rightArray, comparator);

            // Merge the sorted halves
            merge(array, leftArray, rightArray, comparator);
        }
    }

    private static <T> void merge(T[] array, T[] leftArray, T[] rightArray, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        while (i < leftSize && j < rightSize) {
            if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }

        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }
    }
}
