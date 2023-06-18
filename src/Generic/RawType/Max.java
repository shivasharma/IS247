package Generic.RawType;


public class Max {

    public static void main(String[] args) {
        max("Welcome", 23);
        //maxWithGenerics("Welcome",23); //a compile error will display

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
