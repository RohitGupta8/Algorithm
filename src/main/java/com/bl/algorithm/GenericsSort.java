package com.bl.algorithm;

/*
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-10
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GenericsSort {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 1 to Sort String type (insertion  sort)");
        System.out.println("Enter 2 to sort Integer type(Bubble Sort)");
        switch (scanner.nextInt()) {
            case 1 -> GenericsSort.stringSort();
            case 2 -> GenericsSort.integerSort();
        }
    }

    private static void integerSort() {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Size of the list");
        int number = scanner.nextInt();
        System.out.println("Enter " + number + "  to Sort");
        for (int i = 0; i < number; i++) {
            Integer input = scanner.nextInt();
            list.add(input);
        }
        Integer[] intArray = new Integer[list.size()];
        intArray = list.toArray(intArray);
        System.out.println("Before sorting:");
        for (Integer integer : intArray) {
            System.out.print("  " + integer);
        }
        sorting(intArray);
    }

    private static void stringSort() {
        List<String> list = new ArrayList<String>();
        System.out.println("Size of the list");
        int number = scanner.nextInt();
        System.out.println("Enter " + number + "   Strings to Sort");
        for (int i = 0; i < number; i++) {
            String input = scanner.next();
            list.add(input);
        }
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);
        System.out.println("Before sorting:");
        for (String s : stringArray) {
            System.out.print("  " + s);
        }
        sorting(stringArray);
    }

    private static <T extends Comparable<T>> void sorting(T[] sortArray) {
        int length = sortArray.length;
        int j;
        T temp;
        for (int i = 0; i < length; i++) {
            j = i;
            temp = sortArray[i];
            while (j > 0 && temp.compareTo(sortArray[j - 1]) < 0) {
                sortArray[j] = sortArray[j - 1];
                j = j - 1;
            }
            sortArray[j] = temp;//insert unsorted element
        }
        System.out.println("\nSorted Array:");
        for (T t : sortArray) {
            System.out.print("  " + t);
        }
    }
}
