package com.bl.algorithm;

/**
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-10
 */

public class MergeSort {
    /**
     * Merges two sub arrays of arr[].
     * First sub array is arr[l..m]
     * Second sub array is arr[m+1..r]
     */
    static void merge(int[] arr, int l, int m, int r) {
        /* Find sizes of two sub arrays to be merged */
        int length1 = m - l + 1;
        int length2 = r - m;

        /* Create temp arrays */
        int[] L = new int[length1];
        int[] R = new int[length2];

        /*Copy data to temp arrays*/
        System.arraycopy(arr, l, L, 0, length1);
        for (int j = 0; j < length2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        /* Initial indexes of first and second sub arrays */
        int i = 0, j = 0;

        /* Initial index of merged subArray array */
        int k = l;
        while (i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < length1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < length2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    //Method to sort the array
    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /*  function to print array of size length */
    static void printArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr, 0, arr.length - 1);
        System.out.print("The Sorted Array is : ");
        printArray(arr);
    }
}
