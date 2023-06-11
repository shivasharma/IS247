package Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayListSpeed {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        long now = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            // array.add(0,i); //We need to shift so it is slow
            array.add(i); //This will be similar to linked list
        }
        System.out.println("Time taken by ArrayList:" + (System.currentTimeMillis() - now));

        LinkedList<Integer> list = new LinkedList<>();
        now = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.addFirst(i); //Linked list is faster
        }
        System.out.println("Time taken by LinkedList:" + (System.currentTimeMillis() - now));
    }
}
