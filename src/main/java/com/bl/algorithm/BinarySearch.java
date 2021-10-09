package com.bl.algorithm;

/**
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-10
 */

public class BinarySearch<T extends Comparable<T>> {
    /**
     * This method search the word from list of words
     */
    public int binarySearch(T[] arr, T x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"sonali", "geeks", "rohit", "problem"};
        String x = "rohit";
        BinarySearch<String> bs = new BinarySearch<String>();
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
