package Generic.BoundedType;

import java.util.Arrays;
import java.util.List;

//by adding bounded list extends String
public class DataSort<T> {
//public class DataSort<T extends String> {

    private final List<T> list;
    public DataSort(List<T> list) {
        this.list = list;
    }
    public void getSortedData() {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }

    //Bounded to Comparable<T> even Comparable is interface we use keyword extends
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0) {
            return num1;
        }
        return num2;

    }

    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(12, 55, 7, 9);
        List<String> listString = Arrays.asList("C", "B", "A");

        DataSort<Integer> intsorter = new DataSort<>(listInt);
        intsorter.getSortedData();

        DataSort<String> stringSorter = new DataSort<>(listString);
        stringSorter.getSortedData();


        /** Example using Bounded method */
        DataSort<String> sorterBounded = new DataSort<>(listString);
        sorterBounded.getSortedDataBounded(listInt);
        // stringSorter.getSortedDataBounded(listString);
        System.out.println("-------------------calculateMin-------------------------");
        System.out.println(calculateMin("Kenin", "Joe"));

    }

    // This is bounded using extends Number
    public <T extends Number> void getSortedDataBounded(List<T> list) {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }

    }

}
