package org.example;

import java.util.Arrays;

public class Main {

    /* Bubble sort is a type of sorting algorithm we can use to arrange a set of values in ascending order.
    A real-world example is how the contact list on our phones is sorted in alphabetical order.
    This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high. */

    public static void main(String[] args) {
        int[] data = {10, -2, 0, 100, -7, 15};
        bubbleSort(data);
        System.out.println(Arrays.toString(data));
    }

    static void bubbleSort(int[] array) {
        int size = array.length;
        // loop over each element of the array to access them
        for (int i = 0; i < size - 1; i++) {
            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++) {
                // to compare two adjacent elements in the array: "<" - DESC order, ">" - ASC order
                if (array[j] > array[j + 1]) {
                    // swapping will occur if elements aren't in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
