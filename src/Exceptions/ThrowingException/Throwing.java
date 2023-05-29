package Exceptions.ThrowingException;

public class Throwing {
    static double radius;

    static void checkAgeThrow(int age) {
        //using throw
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void setRadius(double newRadius) throws IllegalArgumentException {

        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException(
                    "Radius cannot be negative");
    }


    public static void main(String[] args) {
        //checkAgeThrow(14);
        setRadius(-1);
    }


}