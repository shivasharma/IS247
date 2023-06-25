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
        //This is not in a sorted order
        map.put(100, "IS247");
        map.put(101, "IS147");
        map.put(102, "IS310");
        map.put(105, "IS410");
        map.put(102, "IS310");


        map.put(null, " Null value");
        System.out.println(map);

        System.out.println(map.get(null));
        System.out.println(map.get(101));

        System.out.println("----------------------");
        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }

        Printmap(map);
        //remove item
        System.out.println("After removing element");
        map.remove(102);
        Printmap(map);
    }

    private static void Printmap(Map<Integer, String> map) {
        System.out.println("print using entry");
        System.out.println("----------------------");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -" + entry.getValue());
        }
    }
}
