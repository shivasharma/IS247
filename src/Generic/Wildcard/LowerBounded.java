package Generic.Wildcard;

import java.util.ArrayList;
import java.util.List;

class LowerBoundWildcardExample {

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
/*
Key Points About Lower-Bounded Wildcards
Write Access:
Lower-bounded wildcards are typically used for writing to a collection.
You can add elements of the lower-bound type or its subtypes to the collection.
Read Access:
You can read from the collection, but the elements are treated as Object.

List<? super Integer> list = new ArrayList<Number>();
list.add(10); // Valid: Adding is allowed
// Integer num = list.get(0); // Invalid: Reading returns Object
Object obj = list.get(0); // Valid: Reading as Object

*/
