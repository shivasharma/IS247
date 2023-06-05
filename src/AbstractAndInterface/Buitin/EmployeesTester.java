package AbstractAndInterface.Buitin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employees implements Iterable {
    List<String> str = null;

    public Employees() {
        str = new ArrayList<String>();
        str.add("IS247");
        str.add("programming");
        str.add("is");
        str.add("fun");
    }

    // if we are implementing Iterable interface, the we
// need to define the iterator() method of Iterable
// interface
    public Iterator<String> iterator() {
        return str.iterator();
    }
}

public class EmployeesTester {
    public static void main(String[] args) {
        Employees emps = new Employees();
        for (String st : emps.str) {
            System.out.println(st);
        }
    }
}