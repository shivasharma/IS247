package AbstractAndInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Shiva on 9/2/2017.
 */

class Employee implements Comparable {

    static int i;
    int EmpID;
    String Ename;
    double Sal;

    public Employee() {
        EmpID = i++;
        Ename = "";
        Sal = 0.0;
    }

    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }

    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }

    public int compareTo(Object o1) {
        if (this.Sal == ((Employee) o1).Sal)
            return 0;
        else if ((this.Sal) > ((Employee) o1).Sal)
            return 1;
        else
            return -1;
    }
}

public class CompareableBuiltInInterface {
    public static void main(String[] args) {

        List ts1 = new ArrayList();
        ts1.add(new Employee("Tom", 40000.00));
        ts1.add(new Employee("Harry", 20000.00));
        ts1.add(new Employee("Maggie", 50000.00));
        ts1.add(new Employee("Chris", 70000.00));
        Collections.sort(ts1);
        Iterator itr = ts1.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + "\n");

        }

    }
}
