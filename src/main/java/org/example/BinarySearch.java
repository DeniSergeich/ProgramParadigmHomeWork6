package org.example;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + high / 2;
            int midValue = arr[mid];
            if (midValue < key) {
                low = mid - 1;
            } else if (midValue > key) {
                high = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
