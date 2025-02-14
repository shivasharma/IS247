// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Child class Dog extends the abstract class Animal
class Dog extends Animal {
    // Providing implementation for the abstract method
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Main class
public class AnimalAbstract {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create a Dog object
        myDog.makeSound();  // Calls the implemented method
        myDog.sleep();  // Calls the inherited method
    }
}
