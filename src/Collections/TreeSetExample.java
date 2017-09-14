package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        //Creating and adding elements
        TreeSet<String> al = new TreeSet<String>();
        al.add("IS147");
        al.add("IS247");
        al.add("CS247");
        al.add("MS147");
        //Traversing elements
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
