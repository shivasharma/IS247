package Generic.Wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WildcardDemo {


    //compare this method below with wildcard
    public static <T> void displayData(List<T> l) {
        for (T t : l) {
            System.out.println(t);
        }
    }

    // cannot use ? only for type
    public static void displayDataWildCard(List<?> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }


    public static void displayListObject(List<Object> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }

    public static void printListWildCard(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add((10.5));
        list.add(20.5);

        List<Integer> list1 = new LinkedList<>();
        list1.add((10));
        list1.add(20);
        displayData(list);
        displayData(list1);

        System.out.println("Print using  wildcard");
        displayDataWildCard(list);
        displayDataWildCard(list1);


        List<Integer> li = Arrays.asList(1, 2, 3);
        // displayListObject(li);
        printListWildCard(list);
    }


}
