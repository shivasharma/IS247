package Recursion.LinkedList;

/**
 * Created by Shiva on 6/24/2017.
 */
public class Node {

    int value;
    Node next;

    public Node() {
        value = 0;
        next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String toString() {
        return value + " ";

    }


}
