package BigO.Hw5;

import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.swap;

public class CodeComplexity {

    public static void main(String[] args) {
        System.out.println("The complexity of complexity1 is " + "your answer");
        System.out.println("The complexity of complexity2 is " + "your answer");
        System.out.println("The complexity of complexity3 is " + "your answer");
        System.out.println("The complexity of complexity4 is " + "your answer");

    }


    private static void complexity1(int n) {
        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }
    }

    public static void complexity2(int[] array, int startIndex, int targetIndex) {
        int value = array[startIndex];
        if (startIndex == targetIndex) {
        } else if (startIndex < targetIndex) {
            for (int i = startIndex + 1; i <= targetIndex; i++) {
                array[i - 1] = array[i];
            }
            array[targetIndex] = value;
        } else {
            for (int i = startIndex - 1; i >= targetIndex; i--) {
                array[i + 1] = array[i];
            }
            array[targetIndex] = value;
        }
    }


    public static <E> void complexity3(E[] array, int start, int end, Comparator<E> comparator) {
        if (end - start <= 0) {
            return;
        }

        int i = start;
        int j = end - 1;
        boolean movingI = true;

        while (i < j) {

            if (comparator.compare(array[i], array[j]) > 0) {
                swap(Collections.singletonList(array), i, j);
                movingI = !movingI;
            } else {
                if (movingI) {
                    i++;
                } else {
                    j--;
                }
            }
        }

    }

    private static void complexity4() {
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        System.out.println(array[2]);

    }
}
