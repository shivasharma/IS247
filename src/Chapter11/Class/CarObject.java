package Chapter11.Class;

// Class definition


// Main class
public class CarObject {

    String brand;
    String color;
    int year;

    public static void main(String[] args) {
        // Creating an object of the Car class
        CarObject myCar = new CarObject();

        // Setting attribute values
        myCar.brand = "Tesla";
        myCar.color = "Red";
        myCar.year = 2022;

        // Accessing object's attributes and invoking method
        System.out.println("My car is a " + myCar.year + " " + myCar.brand + " in " + myCar.color + " color.");
        myCar.drive();
    }

    // Method
    void drive() {
        System.out.println("Driving the " + color + " " + brand + "!");
    }
}
