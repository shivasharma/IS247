package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap();
        // LinkedHashMap();
        // PrintKeyValue();
        TreeMap();
    }

    private static void HashMap() {
        //This will not preserve the order in which these data were inserted
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Programming", "Programming refers to a technological process for telling a computer which tasks to perform in order to solve problems.");
        dictionary.put("Java", "Java is a multiplatform, object-oriented programming language that runs on billions of devices world-wide");
        dictionary.put("C#", "programming language developed by Microsoft that runs on the .NET Framework");
        dictionary.put("JavaScript", "JavaScript is the programming language of the Web");

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

    private static void LinkedHashMap() {
        //This will preserve the order in which these data were inserted
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<>();
        dictionary.put("programming", "Programming refers to a technological process for telling a computer which tasks to perform in order to solve problems.");
        dictionary.put("java", "Java is a multiplatform, object-oriented programming language that runs on billions of devices world-wide");
        dictionary.put("C#", "programming language developed by Microsoft that runs on the .NET Framework");
        dictionary.put("JavaScript", "JavaScript is the programming language of the Web");

        //cannot use for loop
        // for(String word:dictionary){}
        System.out.println();
        System.out.println("Using LinkedHashMap");
        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }
    }

    private static void TreeMap() {
        //This will sort in alphabetical order
        TreeMap<String, String> dictionary = new TreeMap<>();
        dictionary.put("programming", "Programming refers to a technological process for telling a computer which tasks to perform in order to solve problems.");
        dictionary.put("A", "Java is a multiplatform, object-oriented programming language that runs on billions of devices world-wide");
        dictionary.put("C#", "programming language developed by Microsoft that runs on the .NET Framework");
        dictionary.put("E", "JavaScript is the programming language of the Web");

        //cannot use for loop
        // for(String word:dictionary){}
        System.out.println();
        System.out.println("Using LinkedHashMap");
        for (String word : dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }
    }

    private static void PrintKeyValue() {
        //This will not preserve the order in which these data were inserted
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Programming", "Programming refers to a technological process for telling a computer which tasks to perform in order to solve problems.");
        dictionary.put("Java", "Java is a multiplatform, object-oriented programming language that runs on billions of devices world-wide");
        dictionary.put("C#", "programming language developed by Microsoft that runs on the .NET Framework");
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
