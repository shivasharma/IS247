package Sorting;

public class QuickSort {
    private int length;
    private int[] array;

    public static void main(String[] a) {

        QuickSort sorter = new QuickSort();
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }

        Integer[] ia = {30, 20, 10, 5, 6, 99};
        GenericQuicksortComparable.qsort(ia, 0, ia.length - 1);
        for (Integer i : ia) {
            System.out.println(i);
        }
    }

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater than the pivot value, and also we will identify a number
             * from right side which is less than the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static class GenericQuicksortComparable {

        public static <T extends Comparable<T>> void qsort(T[] arr, int a, int b) {
            if (a < b) {
                int i = a, j = b;
                T x = arr[(i + j) / 2];

                do {
                    while (arr[i].compareTo(x) < 0) i++;
                    while (x.compareTo(arr[j]) < 0) j--;

                    if (i <= j) {
                        T tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        i++;
                        j--;
                    }

                } while (i <= j);

                qsort(arr, a, j);
                qsort(arr, i, b);
            }
        }
    }
}
