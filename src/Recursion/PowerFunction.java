package Recursion;

import java.util.Scanner;


/**
 * Created by Shiva on 6/24/2017.
 */
public class PowerFunction {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your base number and exponent");
        double number = in.nextDouble();
        int exp = in.nextInt();
        System.out.println(power(number, exp));
    }

    private static double power(double x, int n) {
        double y;
        if (n == 0) return 1.0;
        y = power(x, n / 2);
        y = y * y;
        if (n % 2 == 0)
            return y;
        return x * y;
    }
}
