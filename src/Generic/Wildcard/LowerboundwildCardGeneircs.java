package Generic.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerboundwildCardGeneircs {
    //Only work for the list of Number type.
    static void printListItems1(List<Integer> list) {
        for (Integer num : list) {
            System.out.println(num);
        }
    }

    //Work for Number and any of its subtypes. Integer is a subtype of number. Number is a supertype
    //Change the super to extend and see the difference
    static void printListItems2(List<? super Integer> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }

    static void printListItems3(List<? super Double> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        //Arraylist of Integer type.
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Only accept Integer type list.
        System.out.println("Print of List of Integer type" +
                " using printListItems1 method:");
        printListItems1(list1);

        //Arraylist of Number type.
        //Number is a supertype of integer
        List<Number> list2 = new ArrayList<>();
        list2.add(1.4);
        list2.add(2.3);
        list2.add(3.4);

        System.out.println("Print of List of Number type using" +
                " printListItems2 method:");
        printListItems2(list2);

        //Arraylist of Integer type.
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        //Only accept Integer type list.
        System.out.println("Print of List of Integer type" +
                " using printListItems1 method:");
        printListItems1(list3);

        //Arraylist of Integer type.
        List<Double> list4 = new ArrayList<>();
        list4.add(1.1);
        list4.add(2.2);
        list4.add(3.4);

        //Only accept Integer type list.
        System.out.println("Print of List of Double type" +
                " using printListItems3 method:");
        printListItems3(list4);

//Restrictions on wildcards
        Number n = 12;
        Integer i = 30;
        List<?> li = new ArrayList<>();
        // li.add(12);
        List<? extends Number> l2 = new ArrayList<Integer>();
        // l2.add(12); //cannot do the write here
        //l2.add(n);

        List<? extends Number> l3 = new ArrayList<Integer>();
        List<? super Integer> l4 = new ArrayList<Integer>();
        l4.add(i);
        //l4.add(n); //cannot do this becuase of the lower bound
        List<? super Integer> l5 = new ArrayList<Number>();
        l5.add(i);
        // l3.add(n);

    }


}
