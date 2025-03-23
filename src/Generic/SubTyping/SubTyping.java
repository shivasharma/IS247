package Generic.SubTyping;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {
        // Example 1: Simple subtyping with non-generic types
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i; // Valid: Integer is a subtype of Object

        // Example 2: Subtyping with generics
        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(10)); // Valid: Integer is a subtype of Number
        list.add(Double.valueOf(10.5)); // Valid: Double is a subtype of Number
        // list.add("Hello"); // Invalid: String is not a subtype of Number

        // Example 3: Subtyping with custom generic classes
        List<Box<Integer>> bList = new ArrayList<>();
        bList.add(new Box<>(List.of(1, 2, 4))); // Valid: Box<Integer> is added
        bList.add(new SquareBox<>(List.of(1, 2, 3))); // Valid: SquareBox<Integer> is a subtype of Box<Integer>

        // Example 4: Generic type invariance
        List<Number> l0 = new ArrayList<Number>(); // Valid: ArrayList<Number> is a subtype of List<Number>

        // Example 5: Invalid subtyping with generics
        // List<Number> li = new ArrayList<Integer>(); // Invalid: ArrayList<Integer> is not a subtype of List<Number>
        // ArrayList<Number> li = new ArrayList<Integer>(); // Invalid: ArrayList<Integer> is not a subtype of ArrayList<Number>

        // Example 6: Valid subtyping with the same type argument
        List<Integer> l2 = new ArrayList<Integer>(); // Valid: ArrayList<Integer> is a subtype of List<Integer>
/*
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = intList; // If this were allowed...
        numList.add(10.5); // This would break type safety, as intList is supposed to hold only Integers
        To avoid such issues, Java enforces invariance for generic types.
  */                 
    }
}

