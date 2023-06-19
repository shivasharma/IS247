package Collections.Array;

import java.util.Arrays;

public class ArrayLimitation {
    public static void main(String[] args) throws Exception {
        String num = "2";
        char num1 = num.charAt(0);
        char num2 = num.charAt(0);
        int result = num1 + num2;
        System.out.println(num1);
        //  System.out.println(result);


        char ch = '3';
        char ch1 = '4';
        int ascii = ch;
        int result1 = (ch + ch1);
        // You can also cast char to int
        int castAscii = result1;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);


        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        // array[3]=4;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        int[] numberArray = {12, 24, 63, 45};
        System.out.println("Array before ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        int[] temp = new int[6];
        int length = numberArray.length;
        System.arraycopy(numberArray, 0, temp, 0, length);
        numberArray = temp;

        System.out.println("Array after ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        int[] numberArray1 = {12, 24, 63, 45};
        System.out.println("Array before ReSize: ");
        for (int i = 0; i < numberArray1.length; i++) {
            System.out.println(numberArray1[i]);
        }

        numberArray1 = Arrays.copyOf(numberArray1, 6);
        numberArray1[4] = 11;
        numberArray1[5] = 55;

        System.out.println("Array after ReSize: ");
        for (int i = 0; i < numberArray1.length; i++) {
            System.out.println(numberArray1[i]);
        }

    }


}
