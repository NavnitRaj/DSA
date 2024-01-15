package dsa.algorithm;

import dsa.genericlasses.GenericEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(double[] array) {
        if (array == null || array.length <= 1) {
            return; // Nothing to sort
        }

        int n = array.length;

        // Create buckets
        List<List<Double>> buckets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * array[i]);
            buckets.get(bucketIndex).add(array[i]);
        }

        // Sort individual buckets
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate sorted buckets to obtain the final sorted array
        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double value : bucket) {
                array[index++] = value;
            }
        }
    }
}
