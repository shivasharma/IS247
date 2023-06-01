package Exceptions;

public class ShowRuntimeErrors {
    public static void main(String[] args) {
        divide();
    }

    public static void divide() {
        System.out.println(1 / 0);
    }
}
