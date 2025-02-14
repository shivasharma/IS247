// Step 1: Create a general Bird interface
interface Bird {
    void eat();
}

// Step 2: Create a separate interface for birds that can fly
interface FlyingBird extends Bird {
    void fly();
}

// Step 3: Implement different types of birds
class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }
}

// Step 4: Implement Ostrich class correctly (Does NOT implement FlyingBird)
class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating...");
    }
}

// Step 5: Test the solution
public class LSPBirdExample {
    public static void main(String[] args) {
        // Creating different bird objects
        FlyingBird sparrow = new Sparrow();
        Bird penguin = new Penguin();
        Bird ostrich = new Ostrich();

        // Testing methods
        sparrow.eat();
        sparrow.fly();
        penguin.eat();
        ostrich.eat();
    }
}
