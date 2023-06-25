package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        CreateMaps();


    }

    private static void CreateMaps() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        //insert into the map O(1) complexity
        map.put(100, "IS247");
        map.put(101, "IS147");
        map.put(102, "IS310");
        map.put(102, "IS310");
        map.put(null, " Null value");
        System.out.println(map);
        System.out.println(map.get(null));
        System.out.println(map.get(101));
    }
}
