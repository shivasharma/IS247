package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "green", "orange", "yellow");

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
