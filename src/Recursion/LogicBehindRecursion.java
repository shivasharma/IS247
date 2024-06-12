package Recursion;

public class LogicBehindRecursion {
    public static void main(String[] args) {
        // The stack memory works by LIFO last in first out
        firstMethod();
    }

    static void firstMethod() {
        secondMethod();
        System.out.println("I am the first method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the fourth method");
    }

    static void fourthMethod() {
        System.out.println("I am the first method");
    }
}
