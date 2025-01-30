package Chapter11.IS147Recap;

import static java.lang.Math.PI;

public class Circle {

    public double calculateArea(int radius) {
        return PI * radius * radius; // Using the constant PI
    }

    // Method overloading (same method name, different parameters)
    public double calculateArea(int radius, double pi) {
        return 2 * pi * radius; // Calculating circumference
    }
}

