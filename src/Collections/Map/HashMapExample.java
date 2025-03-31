package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap();
        //HashMapEg();
        // LinkedHashMapEg();
        //LinkedHashMap();

        // PrintKeyValue();
        // TreeMap();
        TreeMapEg();
    }

    private static void HashMap() {


        //This will not preserve the order in which these data were inserted
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Programming", "Programming refers to a technological process....");
        dictionary.put("Java", "Java is a multiplatform, object-oriented programming...");
        dictionary.put("C#", "programming language developed by Microsoft ..");
        dictionary.put("JavaScript", "JavaScript is the programming ....");

        //cannot use for loop
        // for(String word:dictionary){}
        System.out.println("Using HashMap");
        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private static void HashMapEg() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }

    private static void LinkedHashMap() {
        //This will preserve the order in which these data were inserted
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<>();
        dictionary.put("Programming", "Programming refers to a technological process....");
        dictionary.put("Java", "Java is a multiplatform, object-oriented programming...");
        dictionary.put("C#", "programming language developed by Microsoft ..");
        dictionary.put("JavaScript", "JavaScript is the programming ....");

        //cannot use for loop
        // for(String word:dictionary){}
        System.out.println();
        System.out.println("Using LinkedHashMap");
        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }


    }

    private static void LinkedHashMapEg() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(1, "Emily");
        map.put(2, "John");
        map.put(3, "ShiVA");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Keys: " + map.keySet());
        //Fetching value
        System.out.println("Values: " + map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: " + map.entrySet());
    }

    private static void TreeMap() {
        //This will sort in alphabetical order
        TreeMap<String, String> dictionary = new TreeMap<>();
        dictionary.put("programming", "Programming refers to a ...");
        dictionary.put("A", "Java is a multiplatform, object-oriented programming...");
        dictionary.put("C#", "programming language developed by Microsoft ...");
        dictionary.put("E", "JavaScript is the programming ...");

        //cannot use for loop
        // for(String word:dictionary){}
        System.out.println();
        System.out.println("Using LinkedHashMap");
        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }
    }

    private static void TreeMapEg() {
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println();
        System.out.println("Using for loop");
        for (Map.Entry m : capitalCities.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    private static void PrintKeyValue() {
        //This will not preserve the order in which these data were inserted
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Programming", "Programming refers to a technological ....");
        dictionary.put("Java", "Java is a multiplatform, object-oriented ....");
        dictionary.put("C#", "programming language developed .....k");
        dictionary.put("JavaScript", "JavaScript is the programming language of the Web");

        //cannot use for loop
        // for(String word:dictionary){}
        System.out.println("Using HashMap");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
