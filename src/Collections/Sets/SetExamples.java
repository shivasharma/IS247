package Collections.Sets;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Setexample1();
        // DataOrderusingHashset();
        // DataOrderusingLinkedHashSet();


        Set setA = new HashSet();
        Set setB = new LinkedHashSet();
        Set setC = new TreeSet();
    }

    private static void Setexample1() {

        Set<String> s1 = new HashSet<String>();
        s1.addAll(Arrays.asList("A", "B", "C"));

        Set<String> s2 = new HashSet<String>();
        s2.addAll(List.of("A", "D", "E", "F"));

        Set<String> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        //duplicate are removed
        System.out.println("Union" + s3);

        Set<String> s4 = new HashSet<>(s1);
        s4.retainAll(s2);
        //common values
        System.out.println("Intersection:" + s4);
    }

    private static void DataOrderusingHashset() {
        // HashSet could print in any order
        //This is unordered

        Set<String> data = new HashSet<String>();

        data.add("Programming");
        data.add("Set");
        data.add("Example");
        data.add("1");
        data.add("Set");
        data.add("Apple");
        data.add("@");
        System.out.println(data);

        System.out.println(data.contains("Apple"));

    }

    private static void DataOrderusingLinkedHashSet() {
        // LinkedHashSet Data set order is unique
        Set<String> data = new LinkedHashSet<String>();

        data.add("Programming");
        data.add("Set");
        data.add("Example");
        data.add("1");
        data.add("Set");
        data.add("Apple");
        data.add("@");

        System.out.println(data);
    }



}
