package Exceptions;

public class ExceptionCalling {

    public static void main(String[] args) {
        A(); //did error occur here
    }

    static void A() {
        B(); //did error occur here
    }

    static void B() {
        System.out.println(1 / 0); //did error occur here
    }
}