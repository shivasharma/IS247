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

        //  System.out.println("Factorial of " + f + " is: " + factorial(f));

        //System.out.println("Factorial Non Recursive" +factorialNR(f));
        // System.out.println("Factorial  Recursive " +factorialRec(f));
        System.out.println("Factorial  Iterative " + iterativeFactorial(f));

    }

    static int factorial(int n) {
        if (n < 0) { //unintentional case
            return -1;
        }
        if (n == 0 || n == 1) { //basecase
            return 1;
        }
        return n * factorial(n - 1); //Recursive call
    }

    static int factorialNR(int n) {
        if (n == 0 || n == 1) { //basecase
            return 1;
        }
        int factorial = n;
        while (n >= 2) {
            factorial = factorial * (n - 1);
            n--;
        }
        return factorial;

    }

    static int iterativeFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }

    static int factorialRec(int n) {
        //this is base condition what will happend if we remove the if condition
        if (n == 0) {
            return 1;
        }
        return n * factorialRec(n - 1);
    }
}
