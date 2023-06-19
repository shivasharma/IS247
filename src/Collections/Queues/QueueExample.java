package Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        QueuesExample1();
        // QueuesExamples2();


    }

    private static void QueuesExample1() {
        Queue<String> queue = new LinkedList<>();
        //FIFO-O(1) complexity
        queue.add("John");
        queue.add("Shiva");
        queue.add("Daniel");
        queue.add("Katy");
        queue.offer("Smith");

        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("Removing item: " + queue.remove());
        System.out.println("**********************************");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void QueuesExamples2() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {

            queue.add(i); //add elements to the queue
        }
        System.out.println("Element in the queue " + queue);

        int removed = queue.remove();
        System.out.println(removed + " was removed");

        int top = queue.peek();//Retrives, but does not remove the head of this queue
        System.out.println(" top element is " + top);
        System.out.println(queue);

        queue.poll();//Retrives and removes the heado of this queue or return null if empty
        System.out.println("After poll" + queue);
    }


}
