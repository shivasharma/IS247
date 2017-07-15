package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Shiva on 7/8/2017.
 */
public class LargeFactorial {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int n = input.nextInt();
        System.out.println(n + "! is \n" + factorial(n));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i <= n; i++)
            result = result.multiply(new BigInteger(i + " "));
        return result;
    }
}



