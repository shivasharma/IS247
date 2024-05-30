package Exceptions;

public class ExceptionCalling {

    public static void main(String[] args) {
        A(); //Did error occur here?
    }

    static void A() {
        B(); //Did error occur here?
    }

    static void B() {
        System.out.println(1 / 0); //Did error occur here?
    }
}