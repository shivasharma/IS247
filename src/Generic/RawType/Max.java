package Generic.RawType;


public class Max {

    public static void main(String[] args) {
        System.out.println(max(23, 23));
        // System.out.println(maxWithGenerics("12","Welcome")); //a compile error will display

    }

    public static Comparable max(Comparable o1, Comparable o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }

    public static <E extends Comparable<E>> E maxWithGenerics(E o1, E o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
