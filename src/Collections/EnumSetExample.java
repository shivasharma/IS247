package Collections;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        // Traversing elements
        Iterator<days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }

    enum days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
