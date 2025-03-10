package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {

        LinkedList<String> orders = new LinkedList<>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("order 4");
        orders.addFirst("order 5");
        System.out.println(orders);

        orders.removeFirst();
        orders.removeLast();
        
        orders.remove(0);
        orders.remove(Integer.valueOf("order 3"));
                             
        System.out.println(orders);

        //use deque 

        orders.offer(1)
        System.out.println(orders.poll());


  
        
        

    }


}
