package Collections.Map;

import java.util.HashMap;

public class MapExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("IS436", 80);
        marks.put("IS147", 90);
        marks.put("IS247", 96);
        marks.put("IS436", 100); //value is replace key is same
        System.out.println(marks);

        System.out.println(marks.get("IS436"));
        System.out.println(marks.keySet());
        System.out.println(marks.values());
        System.out.println(marks.clone());
        System.out.println(marks.containsKey("IS436"));
        System.out.println(marks.remove("IS436", 100));
    }
}
