import dsa.algorithm.BubbleSort;
import dsa.genericlasses.GenericEmployee;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortMain {
    public static void main(String[] args) {
        GenericEmployee[] arr = {
                new GenericEmployee(1,"Raj"),
                new GenericEmployee(2,"Navnit"),
                new GenericEmployee(5,"Chetan"),
                new GenericEmployee(4,"Harshith"),
                new GenericEmployee(1,"Raj"),
                new GenericEmployee(2,"Navnit"),
                new GenericEmployee(5,"Chetan"),
                new GenericEmployee(4,"Harshith")
        };
        Arrays.stream(arr).forEach(System.out::println);
        BubbleSort.bubbleSort(arr, Comparator.comparing(GenericEmployee::getId));
        System.out.println("After Sort");
        Arrays.stream(arr).forEach(System.out::println);
    }
}