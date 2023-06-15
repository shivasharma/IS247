package Collections.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
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
}
