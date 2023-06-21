package Generic.Wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class upperboundwildcardGenerics {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

        WildcardExamples();
    }

    private static void WildcardExamples() {
        test(new ArrayList<Test>());
        test(new ArrayList<Integer>());
        test(new ArrayList<Object>());
        test2(new ArrayList<Integer>());
        test2(new ArrayList<Test>());
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

    class Test {
    }
}
