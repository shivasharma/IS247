package Recursion;

public class InfiniteRecursion {
    public static void main(String[] args) {
        printIS247();
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
}
