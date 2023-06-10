package Recursion;

public class InfiniteRecursion {
    public static void main(String[] args) {
        printIS247();
        //what will happen if we add 1000000 as a value
        // printIS247(5);
    }

    //java keeps adding call to the methods (Callstack)
    //main method call the printIS247 this method goes to stack
    public static void printIS247() {
        System.out.println("IS247");
        //this again call the printIS247 and add to the stack again
        //Eventually it will fail with stackoverflow
        //debug with intellij

        printIS247();

    }

    public static void printIS247(int count) {
        System.out.printf("%d:IS247", count);
        System.out.println();
        if (count <= 1) {
            return;
        }
        printIS247(count - 1);
    }
}
