package Generic.Wildcard;

import java.util.Arrays;
import java.util.List;

public class WildcardSimpleExample {

    // Method to print elements of a List<Object>
    // This method only accepts a List<Object>, not a List of any other type.
    public static void print(List<Object> list) {
        for (Object o : list) {
            System.out.println(o); // Print each element as an Object
        }
    }

    // Method to print elements of a List<?> (unbounded wildcard)
    // This method accepts a List of any type, because the unbounded wildcard (?) allows any type.
    public static void printwildcard(List<?> list) {
        for (Object o : list) {
            System.out.println(o); // Print each element as an Object
        }
    }

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(1, 2, 3);

        // Attempt to call the print method with List<Integer>
        // This will cause a compilation error because List<Integer> is not a subtype of List<Object>.
        // List<Object> is not a superclass of List<Integer> due to generic type invariance.
        // print(nums); // Uncommenting this line will result in a compilation error

        // Call the printwildcard method with List<Integer>
        // This works because List<?> is compatible with any type of list, including List<Integer>.
        printwildcard(nums); // Output: 1 2 3
    }
}
