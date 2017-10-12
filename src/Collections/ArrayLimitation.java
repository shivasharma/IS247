package Collections;

import java.util.ArrayList;

public class ArrayLimitation {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;
        // numbers[5] = 600; // which is not possible because the size of the array is fixed.
        for (int i : numbers) {
            System.out.print(i + ", ");
        }
      

        ArrayList<Integer> a1 = new ArrayList<Integer>();

        a1.add(1);
        a1.add(1);
        a1.add(2);

        System.out.println(a1);
        for (Integer i : a1) {
            System.out.print(i);
        }

//here the default size is 10 and can be increased during the runtime
    }

}
