// Define an interface
interface Animal {
    void makeSound(); // Abstract method (no body)
      
}

// Implement the interface in a class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.makeSound(); // Output: Bark! Bark!
    }
}
