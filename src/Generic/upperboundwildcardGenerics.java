package Generic;

import java.util.Arrays;
import java.util.List;

public class upperboundwildcardGenerics {

    public static void main(String args[]) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
}
