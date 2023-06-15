package Collections.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        CreateLinkedHashSet();
    }

    private static void CreateLinkedHashSet() {
        //LinkedHashSet no duplicate
        // order is maintained

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("London");
        //only print single null value
        set1.add(null);
        set1.add("Paris");
        set1.add("New York");
        set1.add(null);
        set1.add("New York");
        set1.add(null);
        System.out.println(set1);

        //Traversing elements
        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
