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

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 55, 7, 9);
        List<String> listString = Arrays.asList("hello", "IS", "247");
        DataSort<Integer> intsorter = new DataSort<>(list);
        // intsorter.getSortedData();

        DataSort<String> stringSorter = new DataSort<>(listString);
        //  stringSorter.getSortedData();


        /** Example using Bounded method */
        DataSort<String> sorterBounded = new DataSort<>(listString);
        // sorterBounded.getSortedDataBounded(list);
        // stringSorter.getSortedDataBounded(list);


    }

    public void getSortedData() {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }

    public <T extends Number> void getSortedDataBounded(List<T> list) {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }

    }


}
