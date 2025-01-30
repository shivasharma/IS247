package Chapter11.IS147Recap;

// Class definition
public class Recap {
    // Main method (entry point of the program)
    public static void main(String[] args) {

        // Variable declaration and initialization
        int radius = 5;

        // Object creation
        Circle circle = new Circle();

        // Method call (using method overloading)
        // Calls the first method
        double area = circle.calculateArea(radius);

        // Calls the overloaded method

        double circumference = circle.calculateArea(radius, Math.PI);
        // Output results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        // Array declaration and initialization
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop (for loop)
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // String class usage
        String message = "Hello, Java!";
        System.out.println("Message: " + message);

        // Casting (implicit and explicit)
        int intValue = 100;
        // Implicit casting (int to double)
        double doubleValue = intValue;
        // Explicit casting (double to int)
        int newIntValue = (int) doubleValue;

        // Operators (arithmetic and comparison)
        int sum = intValue + newIntValue;
        boolean isEqual = (intValue == newIntValue);

        System.out.println("Sum: " + sum);
        System.out.println("Are the values equal? " + isEqual);
    }
}

