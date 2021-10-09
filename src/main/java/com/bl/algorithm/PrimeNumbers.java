package com.bl.algorithm;
/*
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-10
 */

import java.util.Scanner;

public class PrimeNumbers {
    /**
     * Purpose : Method to find prime numbers between given range
     */
    private static void isPrime(int lower, int upper) {
        int i, flag, j;
        for (i = lower; i <= upper; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper, lower;
        //Taking limit from the user
        System.out.print("Enter the lower bound : ");
        lower = sc.nextInt();
        System.out.print("Enter the upper bound : ");
        upper = sc.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + "upper  " + upper + "is : ");
        isPrime(lower, upper);
        sc.close();
    }
}
