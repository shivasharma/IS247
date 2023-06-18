package Generic.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    public static void displayData(List<?> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add((10));
        list.add(20);
        displayData(list);
    }
}
