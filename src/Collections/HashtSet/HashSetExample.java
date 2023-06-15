package Collections.HashtSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> set = CreateHashSet();
        TreeSet(set);

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        UnionUsingHashSet(a, b);
        HashSetintersection(a, b);

        HashSetDifference(a, b);


    }

    private static void TreeSet(Set<String> set) {
        // Set example using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(set);
        System.out.println(tree_Set);
    }

    private static void HashSetDifference(Set<Integer> a, Set<Integer> b) {
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        System.out.println("--------------------------");
    }

    private static Set<String> CreateHashSet() {
        // HashSet <E> set =new HashSet<E>(); where E is any kind of data type
        // HashSet<Integer> myint=new HashSet<>();
        // myint.add("shiva"); checking the type
        // HashSet <E> set =new HashSet<E>(Collection c);
        // HashSet<Integer> myint=new HashSet<Ineger>(arr) where arr is an ArrayList;

        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("New York");
        System.out.println(set);
        System.out.println("--------------------------");
        return set;
    }

    private static void UnionUsingHashSet(Set<Integer> a, Set<Integer> b) {
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
        System.out.println("--------------------------");
    }

    private static void HashSetintersection(Set<Integer> a, Set<Integer> b) {
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
        System.out.println("--------------------------");
    }

}
