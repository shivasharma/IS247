package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("New York");
        System.out.println(set);

    }

}
