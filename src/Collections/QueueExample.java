package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {

            queue.add(i);
        }
        System.out.println("Element in the queue " + queue);

        int removed = queue.remove();
        System.out.println(removed + " was removed");

        int top = queue.peek();
        System.out.println(" top element is " + top);
        System.out.println(queue);
        queue.poll();
        System.out.println("After poll" + queue);

/*
        PriorityQueue<String> queue1=new PriorityQueue<String>();
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        queue1.add("D");
        queue1.add("E");
        System.out.println("head:"+queue1.element());
        System.out.println("head:"+queue1.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue1.remove();
        queue1.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue1.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }*/
    }

}
