package Exceptions;

public class NotMatchingException {
    public static void main(String[] main) {
        try {
            System.out.println("Print 1");
            System.out.println(10 / 0);
            System.out.println("Print 2");
        } catch (NullPointerException e) { //ArithmeticException
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("What is wrong with this code?");
        }
    }
}
