package Sorting;

import static java.lang.System.currentTimeMillis;

public class PerformanceTest {

    public static void main(String[] args) {
        getTime(1000000);
        getTime(10000000);
        getTime(100000000);
        getTime(1000000000);
    }

    public static void getTime(long n) {
        long startTime = currentTimeMillis();
        long k = 0;
        for (long i = 1; i <= n; i++) {
            k = k + 5;
        }
        long endTime = currentTimeMillis();
        System.out.println("Execution Time for n= " + n + " is " + (endTime - startTime) + " milliseconds ");
    }
}
