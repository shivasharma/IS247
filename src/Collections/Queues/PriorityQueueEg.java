package Collections.Queues;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg<S> {

    public static void main(String[] args) {
        PriorityQueueDemo1();
        // PriorityQueueDemo2();
    }

    private static void PriorityQueueDemo1() {

        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("MD");
        queue1.offer("DC");
        queue1.offer("VA");
        queue1.offer("NY");

        System.out.println("Priority queue using Comparble");
        while (queue1.size() > 0) {
            System.out.println(queue1.remove() + " ");
        }
        // PriorityQueie(initialcapacity,comparator)
        PriorityQueue<String> queue2 = new PriorityQueue(4, Collections.reverseOrder());
        queue2.offer("MD");
        queue2.offer("DC");
        queue2.offer("VA");
        queue2.offer("NY");

        System.out.println("\n Priority Queue using Comparator");
        while (queue2.size() > 0) {
            System.out.println(queue2.remove() + " ");
        }
    }

    private static void PriorityQueueDemo2() {
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        queue1.add("D");
        queue1.add("E");

        System.out.println("head:" + queue1.element());
        System.out.println("head:" + queue1.peek());
        System.out.println("iterating the queue elements:");

        Iterator itr = queue1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue1.remove();
        queue1.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());

        }


        //

        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.add("D");
        System.out.println("After Using add method.");
        for (String s : pq) {
            System.out.println(s);
        }
        System.out.println("After Using poll method.");

        pq.poll();
        for (String s : pq) {
            System.out.println(s);
        }
        System.out.println("After Using remove method.");
        pq.remove("D");
        for (String s : pq) {
            System.out.println(s);
        }
    }
}
