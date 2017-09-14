package Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericClass {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("IS");
        list.add("247");
        //list.add(32);//compile time error

        String s = list.get(1);//type casting is not required
        System.out.println("element at index 1 is " + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
