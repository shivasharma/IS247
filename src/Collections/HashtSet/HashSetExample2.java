package Collections.HashtSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet(); //default size is 16
        HashSet hs1 = new HashSet(100);//when it is 75% of space use new hashset will be created.It will be current size * 2=200;
        HashSet hs2 = new HashSet(100, .80f);

        ArrayList a1 = new ArrayList();
        HashSet hs4 = new HashSet(a1);

    }
}
