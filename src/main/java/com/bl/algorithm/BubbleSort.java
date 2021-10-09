package com.bl.algorithm;

/**
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-10
 */

public class BubbleSort<T extends Comparable<T>> {
    /**
     * Sort the array
     */
    public void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /**
     * Prints the array
     */
    public void printArray(T[] arr) {
        int n = arr.length;
        for (T t : arr) System.out.print(t + "--->");
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = {"xyz", "pqr", "abc", "qwe", "cba"};
        BubbleSort<String> ob = new BubbleSort<String>();
        ob.bubbleSort(arr);
        System.out.print("Sorted array : ");
        ob.printArray(arr);
    }
}
