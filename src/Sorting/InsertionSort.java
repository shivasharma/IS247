package Sorting;

import java.util.Random;

public class InsertionSort {

    public static void main(String a[]) {

        //int[] array= {10,34,2,56,7,67,88,42};
        int[] array;

        array = new int[1000];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int value = rand.nextInt(1000);
            System.out.print(" " + value);
            array[i] = value;
        }

        insertionTime(array);

        int[] arr2 = insertionSort(array);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }


    public static int[] insertionSort(int[] arg) {
        int key;
        int i;
        for (int j = 1; j < arg.length; j++) {
            key = arg[j];
            i = j - 1;
            while (i >= 0 && arg[i] > key) {
                arg[i + 1] = arg[i];
                i--;
            }
            arg[i + 1] = key;
        }

        return arg;
    }


    public static void insertionTime(int[] arg) {
        // System.out.println(Arrays.toString(arg));
        long time1 = System.currentTimeMillis();
        insertionSort(arg);
        long time2 = System.currentTimeMillis();
        long time = time2 - time1;
        // System.out.println(Arrays.toString(arg));
        System.out.println("-----------------------");
        System.out.println("Insertion sort took " + time + " milliseconds.");
    }


}
