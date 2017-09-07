package OOP.Aggregation;

/**
 * Created by Shiva on 7/29/2017.
 */

class Operation {
    int square(int n) {
        return n * n;
    }
}

public class CircleAgg {

    Operation op;//aggregation
    double pi = 3.14;

    public static void main(String args[]) {
        CircleAgg c = new CircleAgg();
        double result = c.area(10);
        System.out.println("The area of a square is " + result);
    }

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }

}