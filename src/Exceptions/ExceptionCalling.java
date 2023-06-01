package Exceptions;

public class ExceptionCalling {

    public static void main(String[] args) {
        A();
    }

    static void A() {
        B();
    }

    static void B() {
        System.out.println(1 / 0);
    }
}