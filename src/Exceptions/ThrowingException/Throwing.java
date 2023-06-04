package Exceptions.ThrowingException;

import java.io.IOException;

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


    //thorows runtime exception
    public static void setAge1(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero");
        }
        age = age;
    }

    //Checked exception
    public static void setAge2(int age) throws IOException {
        //check age
        age = age;
    }

    public static void main(String[] args) {
        //checkAgeThrow(14);
        //setRadius(-1);

        setAge1(0);
        //setAge2(20);
    }


}