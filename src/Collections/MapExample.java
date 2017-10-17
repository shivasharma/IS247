package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "IS247");
        map.put(101, "IS147");
        map.put(102, "IS310");
        System.out.println(map);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


        Map m = new Hashtable();

        m.put(1, "Test");
        m.put(2, "Test1");

        System.out.println(m);

    }
}
