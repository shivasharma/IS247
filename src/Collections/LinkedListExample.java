package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList states = new LinkedList();

        states.add("Maryland");
        states.add("Arizona");
        states.add("Alaska");
        states.add("California");
        states.add("Colorado");

        states.addFirst("Albama");

        System.out.println(states);
        System.out.println("last state in my list " + states.getLast());
        System.out.println("Contains " + states.contains("Alaska"));

        ListIterator iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {

            System.out.println(iterator.previous());
        }
    }
}
