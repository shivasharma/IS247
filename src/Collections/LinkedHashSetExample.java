package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String args[]) {
        //LinkedHashSet
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("New York");
        System.out.println(set1);
    }
}
