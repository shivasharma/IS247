package Exceptions;

public class ShowRuntimeErros {
    public static void main(String[] args) {
        divide();
    }

    public static void divide() {
        System.out.println(1 / 0);
    }
}
