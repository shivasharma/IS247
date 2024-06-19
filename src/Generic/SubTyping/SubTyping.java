package Generic.SubTyping;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(10.5));
        // list.add("Hello");

        List<Box<Integer>> bList = new ArrayList<>();
        bList.add(new Box(List.of(1, 2, 4)));
        bList.add(new SquareBox<>(List.of(1, 2, 3))); //squarebox is a subtype of Box
        //Both parent and child should have same type argument.
        List<Number> l0 = new ArrayList<Number>();
        //ArryaList is a subtype of list
        // is ArrayList<Integer> subtype of list<Number>????
        //can I use this line?
        // List<Number> li=new ArrayList<Integer>();
        //ArrayList<Number> li=new ArrayList<Integer>();
        // Both type argument must be the same
        List<Integer> l2 = new ArrayList<Integer>();
    }
}
