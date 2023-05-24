package Exceptions.ExceptionHandling;

public class HandlingArithmeticException {

    public static void main(String[] main) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("Division by 0 is not valid");
        }
        System.out.println("More code can go here");
    }
}
