package Generic.Wildcard;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add((10));
        list.add(20);
        displayData(list);
        System.out.println("Print using  wildcard");
        displayDataWildCard(list);
    }


}
