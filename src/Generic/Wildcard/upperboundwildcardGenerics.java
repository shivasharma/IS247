package Generic.Wildcard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcardExample {

    // Method to calculate the sum of a list of numbers
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue(); // Use Number's doubleValue() method
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumOfList(integers)); // Works: Integer is a subtype of Number

        // Create a list of doubles
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubles: " + sumOfList(doubles)); // Works: Double is a subtype of Number

        // Create a list of floats
        List<Float> floats = Arrays.asList(1.5f, 2.5f, 3.5f);
        System.out.println("Sum of floats: " + sumOfList(floats)); // Works: Float is a subtype of Number

        // Invalid: String is not a subtype of Number
        // List<String> strings = Arrays.asList("A", "B", "C");
        // System.out.println("Sum of strings: " + sumOfList(strings)); // Compilation error
    }
}
