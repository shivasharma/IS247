package Recursion.LinkedList;

/**
 * Created by Shiva on 6/24/2017.
 */
public class Main {

    static Node head;

    public static void main(String[] args) {

        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        printList(node1);
    }

    private static void printList(Node n) {
        if (n != null) {
            System.out.println(n.value + " ");
            printList(n.next);

        }
    }
}
