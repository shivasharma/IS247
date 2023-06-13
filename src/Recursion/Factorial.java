package Recursion;

import java.util.Scanner;

/**
 * Created by Shiva on 6/24/2017.
 */
public class Factorial {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number for the factorial problems:");

        int f = in.nextInt();

        System.out.println("Factorial of " + f + " is: " + factorial(f));
    }

    static double factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
