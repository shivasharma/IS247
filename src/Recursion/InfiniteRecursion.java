package Recursion;

public class InfiniteRecursion {
    public static void main(String[] args) {
        printIS247();
    }

    public static void printIS247() {
        System.out.println("IS247");
        printIS247();
    }
}
