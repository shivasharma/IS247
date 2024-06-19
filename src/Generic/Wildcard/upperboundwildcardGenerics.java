package Generic.Wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class upperboundwildcardGenerics {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

        upperBound();

        //  List<String> s1 = Arrays.asList("a", "b", "c");
        //  System.out.println("sum = " + sumOfList(s1));

        // WildcardExamples();
    }

    private static void showAll(List<? extends Number> list) {
        // list.add(new Double(2.4)); //we cannot add using upper bound it does not know what kind ong number is that
        for (Number n : list) {
            System.out.println(n);
        }
    }

    private static void upperBound() {
        List<? extends Number> n1 = new ArrayList<Integer>();
        List<? extends Number> n2 = new ArrayList<Double>();
        List<? extends Number> n3 = new ArrayList<Float>();
        //List<? extends Number> n4 = new ArrayList<String>(); //string is not a subtype of a number
        //List<Integer> nums=new ArrayList<>();

        showAll(Arrays.asList(1, 2, 3));
        showAll(Arrays.asList(1.2f, 2.5f, 3.4f));
        showAll(Arrays.asList(1.5d, 2.5d, 3.5d));//we can read the subtype
        System.out.println(sumOfList(Arrays.asList(1, 3, 4, 5)));
    }
    private static void WildcardExamples() {
        test(new ArrayList<TestClass>());
        test(new ArrayList<Integer>());
        test(new ArrayList<Object>());
        test2(new ArrayList<Integer>());
        test2(new ArrayList<TestClass>());
    }

    //List <? extend Number> means it is bounded and that extends from number only
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    static void test(ArrayList<?> myList) {
        System.out.println("This Arraylist<?> method called");
    }

    static void test2(ArrayList<? extends Object> myList) {
        System.out.println("This ArrayList<? extends Object method called");
    }

    class TestClass {
    }
}
