package Generic.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {

    // Method to add integers to a list of Integer or its supertypes
    public static void addNumbers(List<? super Integer> list) {
        list.add(1); // Valid: Can add Integer to List<Integer>, List<Number>, or List<Object>
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integers = new ArrayList<>();
        addNumbers(integers); // Valid: List<Integer> is compatible with List<? super Integer>
        System.out.println("Integers: " + integers);

        // Create a list of numbers
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers); // Valid: List<Number> is compatible with List<? super Integer>
        System.out.println("Numbers: " + numbers);

        // Create a list of objects
        List<Object> objects = new ArrayList<>();
        addNumbers(objects); // Valid: List<Object> is compatible with List<? super Integer>
        System.out.println("Objects: " + objects);

        // Invalid: List<String> is not compatible with List<? super Integer>
        // List<String> strings = new ArrayList<>();
        // addNumbers(strings); // Compilation error
    }
}
