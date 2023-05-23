package Chapter11.Class;

public class Car {
    // Attributes (properties)
    private String make;
    private final String model;
    private final int year;
    private final double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Methods (behaviors)
    public void start() {
        System.out.println("The car is starting...");
    }

    public void accelerate() {
        System.out.println("The car is accelerating...");
    }

    public void brake() {
        System.out.println("The car is braking...");
    }

    // Getters and setters (accessor and mutator methods) for the attributes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    // Other getter and setter methods for model, year, and price...
}
