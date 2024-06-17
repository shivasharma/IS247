package Collections.LinkedList;

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
        System.out.println("-------------LinkedListExample-----------------");
        LinkedListExample();
    }

    public static void LinkedListExample() {
        LinkedList l1 = new LinkedList();
        l1.add("IS247");
        l1.add(1);
        l1.add(null);
        System.out.println(l1);
        l1.set(1, 5);
        System.out.println(l1);
        l1.add(3, true);
        System.out.println(l1);
        l1.removeLast();
        l1.remove();
        System.out.println("what is my value" + l1);


    }

}
