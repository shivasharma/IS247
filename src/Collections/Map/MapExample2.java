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
    }
}
