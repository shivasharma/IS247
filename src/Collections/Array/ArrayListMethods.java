package Collections.Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) throws IOException {
        ArrayListExample1();
        //ArrayListExample2();
    }


    private static void ArrayListExample1() {
        //This is rawtype
        ArrayList words = new ArrayList();
        words.add("IS");
        words.add("247");
        words.add(10);
        words.add('c');
        words.add(12);
        words.add(12.6);
        // String item1=words.get(0);
        String item1 = (String) words.get(0);

        //How about add object
        Object obj1 = words.get(2);
        Object obj2 = words.get(4);
        //Need to define the datatype
        // System.out.println(obj1 +obj2);

         /*
         int obj3=(int)words.get(2);
         int obj4=(int)words.get(4);
         //Need to define the datatype
         System.out.println((int)obj3 +(int)obj4);
         */
        words.remove(0);


    }

    private static void ArrayListExample2() {
        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);


        // Displaying ArrayList after deletion
        System.out.println(arrli);
        System.out.println("The size is " + arrli.size());
        System.out.println("-----------------");

        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }
        System.out.println("---------USING forEACH method----");
        arrli.forEach(e -> System.out.print(e));

        arrli.remove(1);
        System.out.println("Array  after remove method " + arrli);
        System.out.println("The size is " + arrli.size());


        //declaring ArrayList with initial size n
        //cannot declare with primitive datatype only class
        ArrayList<Integer> arraylist = new ArrayList<Integer>();


        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(1);
        arraylist.trimToSize();
        System.out.println(arraylist);

        List<String> s = new ArrayList<>();
        s.add("IS247");
        System.out.println(s);
    }
}

