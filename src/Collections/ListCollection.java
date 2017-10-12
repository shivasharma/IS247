package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(1);

        myList.add("IS147");
        myList.add("IS247");
        myList.add("IS413");
        System.out.println("Initial list:" + myList);
        System.out.println("-----------------------------------");
    }
}
