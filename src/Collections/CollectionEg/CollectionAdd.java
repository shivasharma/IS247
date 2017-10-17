package Collections.CollectionEg;

import java.util.*;

public class CollectionAdd {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        myList.add("IS147");
        myList.add("IS247");
        myList.add("IS413");
        System.out.println("Initial list:" + myList);
        System.out.println("-----------------------------------");

        Collections.addAll(myList, "IS300", "IS310", "IS300");
        System.out.println("After using addall method:" + myList);
        System.out.println("-----------------------------------");
        System.out.println("The size is " + myList.size());

        System.out.println("-----------------------------------");
        myList.remove(1);
        System.out.println("Array  after remove method " + myList);

        System.out.println("-----------------------------------");
        System.out.println("The size is " + myList.size());
        System.out.println("-----------------------------------");


        System.out.println("----USING HASHSET------");
        System.out.println("-----------------------------------");
        Set<String> set = new HashSet<>();
        set.addAll(myList);
        System.out.println("After adding array usign HashSet:" + set);
        System.out.println("-----------------------------------");
        System.out.println("The set  size  is:" + set.size());
        System.out.println("-----------------------------------");


        System.out.println("----USING  HASHMAP------");
        Map<String, String> map = new HashMap<>();
        map.put("CSS", "style");
        map.put("HTML", "mark up");
        map.put("Oracle", "database");
        map.put("XML", "data");

        printDetails(map);
        map.clear();
        printDetails(map);


    }

    private static void printDetails(Map<String, String> map) {
        String usage = map.get("CSS");
        System.out.println("Map: " + map);
        System.out.println("Map Size:  " + map.size());
        System.out.println("Map is empty:  " + map.isEmpty());
        System.out.println("Map contains CSS key:   " + map.containsKey("CSS"));
        System.out.println("Usage:  " + usage);
        System.out.println("removed:  " + map.remove("CSS"));
        System.out.println("-----------------------------------");

    }
}
