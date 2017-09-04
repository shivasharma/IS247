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

        arrli.remove(1);
        System.out.println("Array  after remove method " + arrli);
        System.out.println("The size is " + arrli.size());
    }
}

