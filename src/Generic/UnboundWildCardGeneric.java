package Generic;

import java.util.Arrays;
import java.util.List;

public class UnboundWildCardGeneric {

    public static void main(String args[]) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        printList1(li);
        printList1(ls);
    }

    public static void printList1(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    /* NOte
    * It’s important to note that List<Object> and List<?> are not the same. You can insert an Object,
      or any subtype of Object, into a List<Object>.
    *
    *
    *
    *
    *
    *
    * */
}
