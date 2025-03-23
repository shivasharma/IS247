package Generic.BoundedType;

import java.util.Arrays;
import java.util.List;

// This is a generic class DataSort that can work with any type T.
// If you want to restrict T to only String, you can use:
// public class DataSort<T extends String> {
public class DataSort<T> {
    private final List<T> list; // A list to hold elements of type T

    // Constructor to initialize the list
    public DataSort(List<T> list) {
        this.list = list;
    }

    // Method to sort and print the list
    public void getSortedData() {
        list.sort(null); // Sort the list (natural ordering)
        for (T t : list) {
            System.out.println(t); // Print each element
        }
    }

    // A generic method with a bounded type parameter
    // T must implement Comparable<T> to ensure it can be compared
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0) {
            return num1; // Return num1 if it is smaller
        }
        return num2; // Otherwise, return num2
    }

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> listInt = Arrays.asList(12, 55, 7, 9);
        // Create a list of strings
        List<String> listString = Arrays.asList("C", "B", "A");

        // Create a DataSort object for integers and sort the list
        DataSort<Integer> intSorter = new DataSort<>(listInt);
        intSorter.getSortedData();

        // Create a DataSort object for strings and sort the list
        DataSort<String> stringSorter = new DataSort<>(listString);
        stringSorter.getSortedData();

        /** Example using Bounded method */
        // Create a DataSort object for strings and call the bounded method
        DataSort<String> sorterBounded = new DataSort<>(listString);
        sorterBounded.getSortedDataBounded(listInt); // This will work because Integer extends Number

        // Uncommenting the line below will cause a compilation error
        // stringSorter.getSortedDataBounded(listString); // Error: String does not extend Number

        System.out.println("-------------------calculateMin-------------------------");
        // Call the calculateMin method with strings
        System.out.println(calculateMin("Kenin", "Joe")); // Output: Joe (lexicographical comparison)
    }

    // This method is bounded using extends Number
    // It can only accept lists of types that extend Number (e.g., Integer, Double)
    public <T extends Number> void getSortedDataBounded(List<T> list) {
        list.sort(null); // Sort the list (natural ordering)
        for (T t : list) {
            System.out.println(t); // Print each element
        }
    }
}
