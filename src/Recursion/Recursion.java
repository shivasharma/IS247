package Recursion;

import java.util.Scanner;

public class Recursion {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numberList = {10, 20, 30, 40, 50};

        reversePrint(numberList);

        System.out.println("");

    }

    private static void reversePrint(int[] numbers) {
        //check for a length of numbers which is a basecase

        if (numbers.length == 0) return;

        //take out first element and reverse the numbers list
        int[] a = new int[numbers.length - 1];

        //check the length -1 of a number but not unit end
        for (int i = 0; i < numbers.length - 1; i++) {

            //skip first element and move rest into new array
            a[i] = numbers[i + 1];
        }
        //recursive method
        reversePrint((a));

        System.out.println(numbers[0] + " ");

    }
}
