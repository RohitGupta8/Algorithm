package com.bl.algorithm;

/**
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-10
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        sort(arr);
        printArray(arr);
    }

    /* This Method is used to print the array */
    private static void printArray(int[] arr) {
        int length = arr.length;
        System.out.print("Array after sorting is : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    /* This  Method is used to sort the array in ascending order */
    private static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
