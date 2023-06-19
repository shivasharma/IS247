package Collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExamples {
    public static void main(String[] args) {
        // MessageStack();


        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("Message1");
        messageStack.push("Message2");
        messageStack.push("Message3");
        messageStack.push("Message4");

        print(messageStack);
        System.out.println(messageStack.pop());
        System.out.println(messageStack.pop());

        print(messageStack);
        System.out.println(messageStack.peek());
        //LIFO order
    }

    private static void MessageStack() {
        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("Message1");
        print(messageStack);
        messageStack.push("Message2");
        print(messageStack);
        messageStack.push("Message3");
        print(messageStack);
        messageStack.push("Message4");
        print(messageStack);
    }

    public static void print(Deque<String> deque) {
        System.out.format("%n --Deque Contents --%n");
        int x = 0;
        for (String msg : deque) {
            System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)" : "");
        }
        System.out.println(" ");
    }
}
