package Generic.Wildcard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void showAll(List<? super Number> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<? super Integer> l1 = new ArrayList<Integer>();
        List<? super Integer> l2 = new ArrayList<Number>();

        //insert item in lower bound
        List<? super Number> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(3.5);
        l3.add(3);

        //how to read items using lower bound
        //check  Numberclass
        List<Serializable> list = new ArrayList<>();
        list.add(1);
        list.add("IS247");
        list.add(1.5d);
        showAll(list);


    }
}
