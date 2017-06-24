package Recursion;

import java.util.Scanner;

/**
 * Created by Shiva on 6/24/2017.
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many should I print");
        int input = in.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(fibonacci(i) + " ");

        }
    }

    private static int fibonacci(int num) {
        //check  whether num is on first or second instance of  my nubmers
        if (num == 1 || num == 2) return 1;

        //when it is three return the number finding three minus two.
        return fibonacci(num - 1) + fibonacci(num - 2);


    }
}
