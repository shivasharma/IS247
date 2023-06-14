package Recursion;

import java.math.BigInteger;

public class MyNumberSumRec {


    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i <= n; i++)
            result = result.multiply(new BigInteger(i + " "));
        return result;
    }
}
