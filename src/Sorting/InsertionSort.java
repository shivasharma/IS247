package Sorting;

import static java.lang.System.currentTimeMillis;

public class InsertionSort {

    public static void main(String a[]) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88};
        getTime(arr1.length);
        int[] arr2 = doInsertionSort(arr1);

        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    public static void getTime(long n) {
        long startTime = currentTimeMillis();
        long k = 0;
        for (long i = 1; i <= n; i++) {
            k = k + 5;
        }
        long endTime = currentTimeMillis();
        System.out.println("Execution Time for n= " + n + " is " + (endTime - startTime) + " milliseconds ");
    }
}
