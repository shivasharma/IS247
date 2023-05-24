package Exceptions;


public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new NumberFormatException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }
}


