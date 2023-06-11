package Collections.Stacks;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("John");
        names.push("Shiva");
        names.push("Daniel");
        names.push("Katy");

        System.out.println(names.size());
        System.out.println(names.peek());
        System.out.println(names.size());

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }
}
