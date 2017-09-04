package Collections;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) throws IOException {
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
        ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
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
    }
}

